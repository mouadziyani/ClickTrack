package ma.youcode.clicktrack.service;

import java.util.List;
import java.util.stream.Collectors;

import ma.youcode.clicktrack.model.dto.clickDto;
import ma.youcode.clicktrack.model.dto.linkDto;
import ma.youcode.clicktrack.model.dto.offreDto;
import ma.youcode.clicktrack.model.entity.Lien;
import ma.youcode.clicktrack.model.entity.Publisher;
import ma.youcode.clicktrack.repository.LinkRepository;
import ma.youcode.clicktrack.repository.PublisherRepository;

public class LinkServiceImp implements LinkService {

    private final LinkRepository lRepository ;
    private final PublisherRepository pRepository;

    public LinkServiceImp(LinkRepository lRepository, PublisherRepository pRepository){
        this.lRepository=lRepository;
        this.pRepository=pRepository;
    }

    @Override
    public void save(long pId, linkDto dto) {    
        Long id =lRepository.getAll().size()+1L;
        Lien nLink = new Lien(id,dto.getOffre(), dto.getUrl(), pId);
        lRepository.save(nLink);
    }

    @Override
    public List<offreDto> getOffres(long id) {  
        return lRepository.getAll().stream()
            .filter(l -> l.getPublisherId() == id)
            .collect(Collectors.groupingBy(Lien::getOffre))
            .entrySet().stream()
            .map(e -> new offreDto(
                e.getKey(),
                (long) e.getValue().size(),
                e.getValue().stream().mapToLong(Lien::getClicks).sum()
            ))
            .toList();
    }

    @Override
    public List<Lien> getPublisherLink(long id) {
        return lRepository.getAll().stream().filter(l->l.getPublisherId()==id).toList();
    }

    @Override
    public clickDto click(long id) {
      Lien l = lRepository.getAll().stream().filter(li->li.getId() == id).findFirst().orElseThrow(()-> new RuntimeException("link not found"));
      l.setClicks(l.getClicks()+1);
      Publisher p = this.pRepository.getAll().stream().filter(pb->pb.getId() == id).findFirst().orElse(null);
      String name = p.getNom() + " " + p.getNom();

      return new clickDto(l.getUrlDestination(), name, l.getOffre(), (long) l.getClicks());
    }
    
}
