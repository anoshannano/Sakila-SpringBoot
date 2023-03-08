package com.example.sakila.repository;

import com.example.sakila.model.Actor;
import org.springframework.data.repository.CrudRepository;

public interface ActorRepo extends CrudRepository<Actor, Long>{
}
