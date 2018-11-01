package com.example.dockerimage.repository;

import com.example.dockerimage.model.Example;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends MongoRepository<Example, String> {
}
