package ma.youcode.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;

import ma.youcode.clicktrack.model.entity.Publisher;
import ma.youcode.clicktrack.model.enums.Categorie;

public class PublisherRepositoryImp implements PublisherRepository{

    private List<Publisher> publishers = new ArrayList<>();

    public PublisherRepositoryImp() {
        publishers.add(new Publisher(1L, "Mouad", "Ziyani", Categorie.INFLUENCER));
        publishers.add(new Publisher(2L, "Bilal", "Fraiha", Categorie.YOUTUBER));
        publishers.add(new Publisher(3L, "Ahmed", "Sabiri", Categorie.INFLUENCER));
        publishers.add(new Publisher(4L, "Omar", "Aarab", Categorie.VLOGGER));
        publishers.add(new Publisher(5L, "Mol", "Sfenja", Categorie.YOUTUBER));
    }
    @Override
    public List<Publisher> getAll() {
        return publishers;
    }

    @Override
    public Publisher findById(Long id) {
        return publishers.stream().filter(p->p.getId().equals(id)).findFirst().orElse(null);
    }
    
}
