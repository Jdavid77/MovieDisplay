package com.joaodavid.moviedisplay.service;
import com.joaodavid.moviedisplay.dto.MovieDTO;
import com.joaodavid.moviedisplay.model.Movie;
import com.joaodavid.moviedisplay.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional
    public Page<MovieDTO> findAll(Pageable pageable) {
        Page<Movie> result = repository.findAll(pageable);
        Page<MovieDTO> page = result.map(x -> new MovieDTO(x));
        return page;
    }

    @Transactional
    public MovieDTO findById(Long Id) {
        Movie result = repository.findById(Id).get();
        MovieDTO dto = new MovieDTO(result);
        return dto;
    }


}
