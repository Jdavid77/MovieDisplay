package com.joaodavid.moviedisplay.model;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_score")
public class Score {

    @EmbeddedId
    private ScorePK Id = new ScorePK();
    private Double value;

    public Score() {
    }

    public void setMovie(Movie movie) {
        Id.setMovie(movie);
    }

    public void setUser(User user) {
        Id.setUser(user);
    }

    public ScorePK getId() {
        return Id;
    }

    public void setId(ScorePK id) {
        Id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }


}
