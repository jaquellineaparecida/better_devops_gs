package com.example.gs_ursa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_motorista")
public class Motorista {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_motorista", nullable = false)
	private Long id_motorista;
	private String nm_completo;
	private String des_cpf;
	private String des_cnh;
	private String modelo_carro;
	private String des_placa;
	
	public Motorista() {}

	public Motorista(Long id_motorista, String nm_completo, String des_cpf, String des_cnh, String modelo_carro,
			String des_placa) {
		this.id_motorista = id_motorista;
		this.nm_completo = nm_completo;
		this.des_cpf = des_cpf;
		this.des_cnh = des_cnh;
		this.modelo_carro = modelo_carro;
		this.des_placa = des_placa;
	}

	public Long getId_motorista() {
		return id_motorista;
	}

	public void setId_motorista(Long id_motorista) {
		this.id_motorista = id_motorista;
	}

	public String getNm_completo() {
		return nm_completo;
	}

	public void setNm_completo(String nm_completo) {
		this.nm_completo = nm_completo;
	}

	public String getDes_cpf() {
		return des_cpf;
	}

	public void setDes_cpf(String des_cpf) {
		this.des_cpf = des_cpf;
	}

	public String getDes_cnh() {
		return des_cnh;
	}

	public void setDes_cnh(String des_cnh) {
		this.des_cnh = des_cnh;
	}

	public String getModelo_carro() {
		return modelo_carro;
	}

	public void setModelo_carro(String modelo_carro) {
		this.modelo_carro = modelo_carro;
	}

	public String getDes_placa() {
		return des_placa;
	}

	public void setDes_placa(String des_placa) {
		this.des_placa = des_placa;
	}
}
