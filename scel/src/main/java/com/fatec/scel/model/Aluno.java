package com.fatec.scel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;
@Entity
public class Aluno {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NaturalId
	@Column(nullable = false, length = 13)
	@NotEmpty(message = "O RA deve ser preenchido") // o atributo nao pode ser nulo e o tamanho > zero
	private String ra;
	
	@Column(nullable = false, length = 100)
	@NotEmpty(message = "O nome deve ser preenchido")
	private String nome;
	
	@Column(nullable = false)
	@NotNull(message = "Email invalido")
	@Size(min = 7, max = 30, message = "O email deve ter entre 1 e 30 caracteres")
	private Long email;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getEmail() {
		return email;
	}

	public void setEmail(Long email) {
		this.email = email;
	}

	
}
