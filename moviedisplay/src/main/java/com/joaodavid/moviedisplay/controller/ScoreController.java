package com.joaodavid.moviedisplay.controller;


import com.joaodavid.moviedisplay.dto.MovieDTO;
import com.joaodavid.moviedisplay.dto.ScoreDTO;
import com.joaodavid.moviedisplay.service.MovieService;
import com.joaodavid.moviedisplay.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {

    @Autowired
    private ScoreService service;

    @PutMapping
    public MovieDTO saveScore(@RequestBody ScoreDTO dto) {
        MovieDTO movieDTO = service.saveScore(dto);
        return movieDTO;
    }


}
