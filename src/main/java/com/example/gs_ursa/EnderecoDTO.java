package com.example.gs_ursa;

public class EnderecoDTO {

	private Long id_endereco;
	private Long id_usuario;
	private String des_endereco;
	private String des_cidade;
	private String des_estado;
	private String des_tag;
	
	public EnderecoDTO() {}

	public EnderecoDTO(Long id_endereco, Long id_usuario, String des_endereco, String des_cidade, String des_estado,
			String des_tag) {
		this.id_endereco = id_endereco;
		this.id_usuario = id_usuario;
		this.des_endereco = des_endereco;
		this.des_cidade = des_cidade;
		this.des_estado = des_estado;
		this.des_tag = des_tag;
	}
	
	public EnderecoDTO(Endereco endereco) {
		this.id_endereco = endereco.getId_endereco();
		this.id_usuario = endereco.getId_usuario();
		this.des_endereco = endereco.getDes_endereco();
		this.des_cidade = endereco.getDes_cidade();
		this.des_estado = endereco.getDes_estado();
		this.des_tag = endereco.getDes_tag();
	}

	public Long getId_endereco() {
		return id_endereco;
	}

	public void setId_endereco(Long id_endereco) {
		this.id_endereco = id_endereco;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getDes_endereco() {
		return des_endereco;
	}

	public void setDes_endereco(String des_endereco) {
		this.des_endereco = des_endereco;
	}

	public String getDes_cidade() {
		return des_cidade;
	}

	public void setDes_cidade(String des_cidade) {
		this.des_cidade = des_cidade;
	}

	public String getDes_estado() {
		return des_estado;
	}

	public void setDes_estado(String des_estado) {
		this.des_estado = des_estado;
	}

	public String getDes_tag() {
		return des_tag;
	}

	public void setDes_tag(String des_tag) {
		this.des_tag = des_tag;
	}
}
