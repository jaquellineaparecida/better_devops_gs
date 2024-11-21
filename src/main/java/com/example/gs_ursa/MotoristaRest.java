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
@RequestMapping(value = "/motorista")
public class MotoristaRest {

	@Autowired
	private MotoristaRepository rep;
	
	@Autowired
	private MotoristaDTOService serv;
	
	//Insert
	@Operation(description = "Este serviço insere um novo motorista")
	@PostMapping
	public Motorista insert(@Valid @RequestBody Motorista m) {
		rep.save(m);
		return m;
	}
	
	//GetAll
	@Operation(description = "Retorna todos os motoristas")
	@GetMapping(value = "/todos")
	public List<Motorista> buscaTodos(){
		return rep.findAll();
	}
	
	//Update
	@Operation(description = "Este serviço atualiza um motorista")
	@PutMapping(value = "/atualizar/{id}")
	public void update(@PathVariable Long id, @RequestBody Motorista m) {

		Motorista m1 = rep.findById(id).get();

		m1.setNm_completo(m.getNm_completo());
		m1.setDes_cpf(m.getDes_cpf());
		m1.setDes_cnh(m.getDes_cnh());
		m1.setModelo_carro(m.getModelo_carro());
		m1.setDes_placa(m.getDes_placa());

		rep.save(m1);
	}
	
	//Delete
	@Operation(description = "Este serviço remove um motorista")
	@DeleteMapping(value = "/deletar/{id}")
	public void apagarMotoristaById(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
	//Paginação
	@Operation(description = "Retorna os motoristas paginados")
	@GetMapping(value = "/todos_paginados")
	public ResponseEntity<Page<MotoristaDTO>>
	buscaMotoristasPaginados(@RequestParam(value="page",defaultValue = "0") Integer page,
	@RequestParam(value="size", defaultValue = "1") Integer size){
		PageRequest request = PageRequest.of(page, size);
		Page<MotoristaDTO> lista = serv.find(request);
		return ResponseEntity.ok(lista);
	}
}
