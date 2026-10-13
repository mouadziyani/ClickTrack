package ma.youcode.clicktrack.controller;

import java.util.List;
import ma.youcode.clicktrack.model.entity.Publisher;

import org.springframework.web.bind.annotation.GetMapping;

import ma.youcode.clicktrack.service.PublisherService;

public class PublisherController {
    private final PublisherService pService ;
    public PublisherController(PublisherService pService){
        this.pService=pService;
    }

    @GetMapping
    public List<Publisher>getAll(){
        return pService.getAll();
    }


}
