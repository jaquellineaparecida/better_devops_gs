package com.example.gs_ursa;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario", nullable = false)
	private Long id_usuario;
	private String nm_completo;
	private Date dt_nascimento;
	private String des_cpf;
	private String des_telefone;
	private String des_email;
	private String des_senha;
	
	public Usuario() {}

	public Usuario(Long id_usuario, String nm_completo, Date dt_nascimento, String des_cpf, String des_telefone,
			String des_email, String des_senha) {
		this.id_usuario = id_usuario;
		this.nm_completo = nm_completo;
		this.dt_nascimento = dt_nascimento;
		this.des_cpf = des_cpf;
		this.des_telefone = des_telefone;
		this.des_email = des_email;
		this.des_senha = des_senha;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNm_completo() {
		return nm_completo;
	}

	public void setNm_completo(String nm_completo) {
		this.nm_completo = nm_completo;
	}

	public Date getDt_nascimento() {
		return dt_nascimento;
	}

	public void setDt_nascimento(Date dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}

	public String getDes_cpf() {
		return des_cpf;
	}

	public void setDes_cpf(String des_cpf) {
		this.des_cpf = des_cpf;
	}

	public String getDes_telefone() {
		return des_telefone;
	}

	public void setDes_telefone(String des_telefone) {
		this.des_telefone = des_telefone;
	}

	public String getDes_email() {
		return des_email;
	}

	public void setDes_email(String des_email) {
		this.des_email = des_email;
	}

	public String getDes_senha() {
		return des_senha;
	}

	public void setDes_senha(String des_senha) {
		this.des_senha = des_senha;
	}
}
