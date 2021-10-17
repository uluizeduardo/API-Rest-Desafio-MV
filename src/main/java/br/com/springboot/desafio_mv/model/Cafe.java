package br.com.springboot.desafio_mv.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Cafe implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	private String pao;
	private String queijo;
	private String presunto;
	private String leite;
	private String cafe;
	private String cuscuz;
	private String achocolatado;
	private String bolo;
	private String iorgute;
	private String suco;

}
