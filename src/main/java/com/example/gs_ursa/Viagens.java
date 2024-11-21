package com.example.gs_ursa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_viagens")
public class Viagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_viagens", nullable = false)
	private Long id_viagens;
	
	@Column(name = "id_usuario", nullable = false)
	private Long id_usuario;
	
	@Column(name = "id_motorista", nullable = false)
	private Long id_motorista;
	
	private String des_local_partida;
	private String des_local_destino;
	private Float km_percorrido;
	private Float preco;
	private String forma_pagamento;
	
	public Viagens() {}

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
