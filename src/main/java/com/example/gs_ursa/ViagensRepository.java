package com.example.gs_ursa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ViagensRepository extends JpaRepository<Viagens, Long>{

	@Query("from Viagens ar where ar.id_viagens = :id_viagens")
	public List<Viagens> buscaTudo(Long id_viagens);
}
