package ma.youcode.clicktrack.service;

import java.util.List;

import ma.youcode.clicktrack.model.entity.Publisher;
import ma.youcode.clicktrack.repository.PublisherRepository;

public class PublisherServiceImp implements PublisherService{
    public final PublisherRepository pRepository ;

    public PublisherServiceImp(PublisherRepository pRepository){
        this.pRepository = pRepository ;
    }

    @Override
    public List<Publisher> getAll() {
        return pRepository.getAll();
    }

    @Override
    public Publisher findById(Long id) {
        return  pRepository.findById(id);
    }
    
}
