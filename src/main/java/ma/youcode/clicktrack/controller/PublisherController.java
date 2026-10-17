package ma.youcode.clicktrack.controller;

import java.util.List;

import ma.youcode.clicktrack.model.dto.linkDto;
import ma.youcode.clicktrack.model.dto.offreDto;
import ma.youcode.clicktrack.model.entity.Lien;
import ma.youcode.clicktrack.model.entity.Publisher;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import ma.youcode.clicktrack.service.LinkService;
import ma.youcode.clicktrack.service.PublisherService;

@RestController
@RequestMapping("/api/publishers")
public class PublisherController {
    private final PublisherService pService ;
    private final LinkService lService;
    public PublisherController(PublisherService pService , LinkService lService){
        this.pService=pService;
        this.lService = lService;
    }

    @GetMapping
    public List<Publisher>getAll(){
        return pService.getAll();
    }

    @PostMapping("/{id}/liens")
    @ResponseStatus(HttpStatus.CREATED)
    public void save(@PathVariable("id")Long id, @RequestBody linkDto dto){
        lService.save(id, dto);
    }

}
