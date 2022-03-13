package com.joaodavid.moviedisplay.repository;

import com.joaodavid.moviedisplay.model.Score;
import com.joaodavid.moviedisplay.model.ScorePK;
import com.joaodavid.moviedisplay.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {


}
