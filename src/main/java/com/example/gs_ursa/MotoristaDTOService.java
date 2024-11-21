package com.example.gs_ursa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MotoristaDTOService {

	@Autowired
	private MotoristaRepository repA;

	@Transactional(readOnly = true)
	public Page<MotoristaDTO> find(PageRequest req) {
		Page<Motorista> lista = repA.findAll(req);
		return lista.map(x -> new MotoristaDTO(x));
	}
}
