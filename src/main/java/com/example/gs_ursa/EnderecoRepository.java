package com.example.gs_ursa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

	@Query("from Endereco ar where ar.id_endereco = :id_endereco")
	public List<Endereco> buscaTudo(Long id_endereco);
}
