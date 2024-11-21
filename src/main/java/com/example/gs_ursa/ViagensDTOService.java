package com.example.gs_ursa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ViagensDTOService {

	@Autowired
	private ViagensRepository repA;

	@Transactional(readOnly = true)
	public Page<ViagensDTO> find(PageRequest req) {
		Page<Viagens> lista = repA.findAll(req);
		return lista.map(x -> new ViagensDTO(x));
	}
}
