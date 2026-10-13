package ma.youcode.clicktrack.service;

import java.util.List;

import ma.youcode.clicktrack.model.entity.Publisher;

public class PublisherServiceImp implements PublisherService{
    public final PublisherService pService ;

    public PublisherServiceImp(PublisherService pService){
        this.pService = pService ;
    }

    @Override
    public List<Publisher> getAll() {
        return pService.getAll();
    }

    @Override
    public Publisher findById(Long id) {
        return  pService.findById(id);
    }
    
}
