package com.example.gs_ursa;

public class ViagensDTO {

	private Long id_viagens;
	private Long id_usuario;
	private Long id_motorista;
	private String des_local_partida;
	private String des_local_destino;
	private Float km_percorrido;
	private Float preco;
	private String forma_pagamento;
	
	public ViagensDTO() {}

	public ViagensDTO(Long id_viagens, Long id_usuario, Long id_motorista, String des_local_partida,
			String des_local_destino, Float km_percorrido, Float preco, String forma_pagamento) {
		this.id_viagens = id_viagens;
		this.id_usuario = id_usuario;
		this.id_motorista = id_motorista;
		this.des_local_partida = des_local_partida;
		this.des_local_destino = des_local_destino;
		this.km_percorrido = km_percorrido;
		this.preco = preco;
		this.forma_pagamento = forma_pagamento;
	}
	
	public ViagensDTO(Viagens viagens) {
		this.id_viagens = viagens.getId_viagens();
		this.id_usuario = viagens.getId_usuario();
		this.id_motorista = viagens.getId_motorista();
		this.des_local_partida = viagens.getDes_local_partida();
		this.des_local_destino = viagens.getDes_local_destino();
		this.km_percorrido = viagens.getKm_percorrido();
		this.preco = viagens.getPreco();
		this.forma_pagamento = viagens.getForma_pagamento();
	}

	public Long getId_viagens() {
		return id_viagens;
	}

	public void setId_viagens(Long id_viagens) {
		this.id_viagens = id_viagens;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Long getId_motorista() {
		return id_motorista;
	}

	public void setId_motorista(Long id_motorista) {
		this.id_motorista = id_motorista;
	}

	public String getDes_local_partida() {
		return des_local_partida;
	}

	public void setDes_local_partida(String des_local_partida) {
		this.des_local_partida = des_local_partida;
	}

	public String getDes_local_destino() {
		return des_local_destino;
	}

	public void setDes_local_destino(String des_local_destino) {
		this.des_local_destino = des_local_destino;
	}

	public Float getKm_percorrido() {
		return km_percorrido;
	}

	public void setKm_percorrido(Float km_percorrido) {
		this.km_percorrido = km_percorrido;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getForma_pagamento() {
		return forma_pagamento;
	}

	public void setForma_pagamento(String forma_pagamento) {
		this.forma_pagamento = forma_pagamento;
	}
}
