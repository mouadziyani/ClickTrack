package ma.youcode.clicktrack.repository;

import java.util.List;

import ma.youcode.clicktrack.model.entity.Publisher;

public interface PublisherRepository {

    public List<Publisher> getAll();

    public Publisher findById(Long id);

}
