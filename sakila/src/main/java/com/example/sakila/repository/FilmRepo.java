package com.example.sakila.repository;

import com.example.sakila.model.Film;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends CrudRepository<Film,Long> {
}
