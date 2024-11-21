package com.example.gs_ursa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MotoristaRepository extends JpaRepository<Motorista, Long>{

	@Query("from Motorista ar where ar.id_motorista = :id_motorista")
	public List<Motorista> buscaTudo(Long id_motorista);
}
