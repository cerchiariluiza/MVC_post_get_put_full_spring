	package com.example.demo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

//CRIANDO A TABELA
@Entity
@Table(name="tb_manutencao2")
public class ManutencaoTable {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private boolean pago;
	
	public boolean isPago() {
		return pago;
	}

	public void setPago(boolean pago) {
		this.pago = pago;
	}

	@Column
	private String nome;
	

	@Column
	private String categoria;
	
	@Column
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date data;

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	
//	@Temporal(TemporalType.TIMESTAMP)     
//	private Date dataEnvio = new java.sql.Date(System.currentTimeMillis());
//	
//	public Date getDataEnvio() {
//	return dataEnvio;
//}
//
//public void setDataEnvio(Date dataEnvio) {
//	this.dataEnvio = dataEnvio;
//}
}
