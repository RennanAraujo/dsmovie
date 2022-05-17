package com.devsuperior.dsmovie.entities;

import javax.persistence.*;

@Entity //É preferível escolher a especificação e não a implementação (Hibernate)
@Table(name = "tb_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String email;

	/*Roteiro:
	* Criar a classe
	* Reescrever os construtores, um vazio e um completo
	* Métodos getters and setters
	* */

	public User(){
		//Como vou sobrescrever o construtor default, preciso implementá-lo
	}
	public User(Long id, String email){
		this.id = id;
		this.email = email;
	}
	public Long getId(){
		return id;
	}
	public void setId(Long id){
		this.id = id;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String email){
		this.email = email;
	}

}
