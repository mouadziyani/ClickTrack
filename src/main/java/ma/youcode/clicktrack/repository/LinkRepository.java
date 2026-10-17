package ma.youcode.clicktrack.repository;

import java.util.List;

import ma.youcode.clicktrack.model.entity.Lien;

public interface LinkRepository {
    List<Lien> getAll();
    public void save(Lien Lien);
}
