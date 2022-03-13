package com.joaodavid.moviedisplay.dto;

import com.joaodavid.moviedisplay.model.Movie;

public class MovieDTO {

    private Long Id;
    private String title;
    private Double score;
    private Integer count;
    private String image;

    public MovieDTO () {

    }

    public MovieDTO(Long id, String title, Double score, Integer count, String image) {
        Id = id;
        this.title = title;
        this.score = score;
        this.count = count;
        this.image = image;
    }

    public MovieDTO(Movie movie) {
        Id = movie.getId();
        title = movie.getTitle();
        score = movie.getScore();
        count = movie.getCount();
        image = movie.getImage();
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
