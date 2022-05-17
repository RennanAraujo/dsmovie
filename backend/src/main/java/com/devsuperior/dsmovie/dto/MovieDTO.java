package com.devsuperior.dsmovie.dto;

import com.devsuperior.dsmovie.entities.Movie;

public class MovieDTO {
	//O objeto DTO é mais simples que o original e não está monitorado no BD pela JPA
	//Serve para transitar os dados
	private Long id; //Pra tratar com BD, é melhor usar os tipos derivados em vez dos primitivos
	private String title;
	private Double score;
	private Integer count;
	private String image;

	public MovieDTO() {
		//constructor vazio
	}

	public MovieDTO(Long id, String title, Double score, Integer count, String image) {
		//construtor completo
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public MovieDTO(Movie movie) {
		//Não precisa do this aqui pq não há ambiguidade
		//construtor completo
		id = movie.getId();
		title = movie.getTitle();
		score = movie.getScore();
		count = movie.getCount();
		image = movie.getImage();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
