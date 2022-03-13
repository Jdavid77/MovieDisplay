package com.joaodavid.moviedisplay.repository;

import com.joaodavid.moviedisplay.model.Movie;
import com.joaodavid.moviedisplay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);

}
