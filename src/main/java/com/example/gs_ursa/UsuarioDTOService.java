package com.example.gs_ursa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioDTOService {

	@Autowired
	private UsuarioRepository repA;

	@Transactional(readOnly = true)
	public Page<UsuarioDTO> find(PageRequest req) {
		Page<Usuario> lista = repA.findAll(req);
		return lista.map(x -> new UsuarioDTO(x));
	}
}
