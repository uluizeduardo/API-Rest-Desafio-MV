package br.com.springboot.desafio_mv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int cpf;
	private String nome;

}