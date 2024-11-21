package com.example.gs_ursa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/viagens")
public class ViagensRest {

	@Autowired
	private ViagensRepository rep;
	
	@Autowired
	private ViagensDTOService serv;
	
	//Insert
	@Operation(description = "Este serviço insere uma nova viagem")
	@PostMapping
	public Viagens insert(@Valid @RequestBody Viagens v) {
		rep.save(v);
		return v;
	}
	
	//GetAll
	@Operation(description = "Retorna todas as viagens")
	@GetMapping(value = "/todos")
	public List<Viagens> buscaTodos(){
		return rep.findAll();
	}
	
	//Update
	@Operation(description = "Este serviço atualiza uma viagem")
	@PutMapping(value = "/atualizar/{id}")
	public void update(@PathVariable Long id, @RequestBody Viagens v) {

		Viagens v1 = rep.findById(id).get();

		v1.setId_usuario(v.getId_usuario());
		v1.setId_motorista(v.getId_motorista());
		v1.setDes_local_partida(v.getDes_local_partida());
		v1.setDes_local_destino(v.getDes_local_destino());
		v1.setKm_percorrido(v.getKm_percorrido());
		v1.setPreco(v.getPreco());
		v1.setForma_pagamento(v.getForma_pagamento());

		rep.save(v1);
	}
	
	//Delete
	@Operation(description = "Este serviço remove uma viagem")
	@DeleteMapping(value = "/deletar/{id}")
	public void apagarViagensById(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
	//Paginação
	@Operation(description = "Retorna as viagens paginadas")
	@GetMapping(value = "/todos_paginados")
	public ResponseEntity<Page<ViagensDTO>>
	buscaViagensPaginados(@RequestParam(value="page",defaultValue = "0") Integer page,
	@RequestParam(value="size", defaultValue = "1") Integer size){
		PageRequest request = PageRequest.of(page, size);
		Page<ViagensDTO> lista = serv.find(request);
		return ResponseEntity.ok(lista);
	}
}
