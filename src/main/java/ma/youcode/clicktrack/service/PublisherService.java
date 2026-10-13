package ma.youcode.clicktrack.service;

import java.util.List;

import ma.youcode.clicktrack.model.entity.Publisher;

public interface PublisherService {
    public List<Publisher> getAll();

    public Publisher findById(Long id);

}