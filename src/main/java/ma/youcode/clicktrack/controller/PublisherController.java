package ma.youcode.clicktrack.controller;

import java.util.List;
import java.util.Map;

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
    public Map<String, Object> save(
            @PathVariable("id") Long id,
            @RequestBody linkDto dto) {

        Lien lien = lService.save(id, dto);

        String trackingUrl = "/t/" + lien.getId();

        return Map.of(
                "id", lien.getId(),
                "trackingUrl", trackingUrl
        );
    }

    @GetMapping("/{id}/offres")
    public List<offreDto> getOffre(@PathVariable("id") long id){
        return lService.getOffres(id);
    }
    @GetMapping("/{id}/liens")
    public List<Lien> getLiens(@PathVariable("id") long id){
        return lService.getPublisherLink(id);
    }

}
