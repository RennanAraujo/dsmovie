package com.devsuperior.dsmovie.entities; //IntelliJ  não deixa colocar "com.devsuperior.dsmovie.entities"

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity //É preferível escolher a especificação e não a implementação (Hibernate)
@Table(name = "tb_movie")
public class Movie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; //Pra tratar com BD, é melhor usar os tipos derivados em vez dos primitivos
	private String title;
	private Double score;
	private Integer count;
	private String image;

	public Movie(){
		//constructor vazio
	}

	public Movie(Long id, String title, Double score, Integer count, String image){
		//construtor completo
		this.id = id;
		this.title = title;
		this.score = score;
		this.count = count;
		this.image = image;
	}

	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String setTitle(){
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public Double getScore(){
		return score;
	}
	public void setScore(Double score){
		this.score = score;
	}
	public Integer getCount(){
		return count;
	}
	public void setCount(Integer count){
		this.count = count;
	}
	public String getImage(){
		return image;
	}
	public void setImage(String image){
		this.image = image;
	}

}
