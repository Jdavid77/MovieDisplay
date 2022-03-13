package com.joaodavid.moviedisplay.repository;

import com.joaodavid.moviedisplay.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
