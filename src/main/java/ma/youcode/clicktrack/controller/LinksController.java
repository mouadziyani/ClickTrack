package ma.youcode.clicktrack.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ma.youcode.clicktrack.model.dto.clickDto;
import ma.youcode.clicktrack.service.LinkService;

@RestController 
@RequestMapping ("/t")
public class LinksController {
    private final LinkService lService ;
    public LinksController(LinkService lService){
        this.lService=lService;
    }

    @GetMapping ("/{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public clickDto click(@PathVariable("id")long id){
        return lService.click(id);
    }
}
