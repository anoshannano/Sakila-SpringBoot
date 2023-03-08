package com.example.sakila.controller;

import com.example.sakila.model.Film;
import com.example.sakila.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@CrossOrigin
@RestController
public class FilmController {

    @Autowired
    private FilmRepo filmRepo;

    @GetMapping("/all-film")
    public Iterable<Film> findAll(){ return filmRepo.findAll();}

    @GetMapping("/find-film-actor/{filmId}")
    public Film findFilmActor(@PathVariable("filmId") Long id){
        Optional<Film>  opt = filmRepo.findById(id);
        return opt.orElseGet(Film::new);

//        if(opt.isPresent()){
//            return opt.get();
//        }else { return new Film();}

    }
}
