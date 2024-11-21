package com.example.gs_ursa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EnderecoDTOService {

	@Autowired
	private EnderecoRepository repA;

	@Transactional(readOnly = true)
	public Page<EnderecoDTO> find(PageRequest req) {
		Page<Endereco> lista = repA.findAll(req);
		return lista.map(x -> new EnderecoDTO(x));
	}
}
