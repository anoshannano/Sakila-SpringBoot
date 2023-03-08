package com.example.sakila.controller;

import com.example.sakila.model.Actor;
import com.example.sakila.repository.ActorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActorContoller {
    @Autowired
    private ActorRepo actorRepo;

    @GetMapping("/all-actor")
    public Iterable<Actor> findAll(){ return actorRepo.findAll();}

}
