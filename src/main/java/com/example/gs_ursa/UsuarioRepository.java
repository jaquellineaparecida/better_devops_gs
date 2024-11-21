package com.example.gs_ursa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	@Query("from Usuario ar where ar.id_usuario = :id_usuario")
	public List<Usuario> buscaTudo(Long id_usuario);
}