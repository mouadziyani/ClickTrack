package ma.youcode.clicktrack.repository;

import java.util.ArrayList;
import java.util.List;

import ma.youcode.clicktrack.model.entity.Lien;

public class LinkRepositoryImp implements LinkRepository{

    List<Lien> lien = new ArrayList<>();

    @Override
    public List<Lien> getAll() {

        return lien;
    }

    @Override
    public void save(Lien Lien) {
        lien.add(Lien);
    }
    
}
