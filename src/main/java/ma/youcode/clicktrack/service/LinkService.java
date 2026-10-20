package ma.youcode.clicktrack.service;

import java.util.List;

import ma.youcode.clicktrack.model.dto.clickDto;
import ma.youcode.clicktrack.model.dto.linkDto;
import ma.youcode.clicktrack.model.dto.offreDto;
import ma.youcode.clicktrack.model.entity.Lien;

public interface LinkService {
    Lien save(long pId, linkDto dto);
    public List<offreDto> getOffres(long id);
    public List<Lien> getPublisherLink(long id);
    public clickDto click(long id);
}
