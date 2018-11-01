package com.example.dockerimage.controller;

import com.example.dockerimage.model.Example;
import com.example.dockerimage.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.ValidationException;
import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/example")
public class ExampleRestController {

    @Autowired
    private ExampleRepository repository;

    @GetMapping("/{id}")
    public Example findById(@PathVariable String id) {

        return repository.findById(id).orElseThrow(() -> new ValidationException("Example não encontrado."));
    }

    @PostMapping
    public Example save(@RequestBody Example example) {
        return repository.save(example);
    }
}
