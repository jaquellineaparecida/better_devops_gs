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
@RequestMapping(value = "/endereco")
public class EnderecoRest {

	@Autowired
	private EnderecoRepository rep;
	
	@Autowired
	private EnderecoDTOService serv;
	
	//Insert
	@Operation(description = "Este serviço insere um novo endereço")
	@PostMapping
	public Endereco insert(@Valid @RequestBody Endereco e) {
		rep.save(e);
		return e;
	}
	
	//GetAll
	@Operation(description = "Retorna todos os endereços")
	@GetMapping(value = "/todos")
	public List<Endereco> buscaTodos(){
		return rep.findAll();
	}
	
	//Update
	@Operation(description = "Este serviço atualiza um endereço")
	@PutMapping(value = "/atualizar/{id}")
	public void update(@PathVariable Long id, @RequestBody Endereco e) {

		Endereco e1 = rep.findById(id).get();

		e1.setId_usuario(e.getId_usuario());
		e1.setDes_endereco(e.getDes_endereco());
		e1.setDes_cidade(e.getDes_cidade());
		e1.setDes_estado(e.getDes_estado());
		e1.setDes_tag(e.getDes_tag());

		rep.save(e1);
	}
	
	//Delete
	@Operation(description = "Este serviço remove um endereço")
	@DeleteMapping(value = "/deletar/{id}")
	public void apagarEnderecoById(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
	//Paginação
	@Operation(description = "Retorna os endereços paginados")
	@GetMapping(value = "/todos_paginados")
	public ResponseEntity<Page<EnderecoDTO>>
	buscaEnderecosPaginados(@RequestParam(value="page",defaultValue = "0") Integer page,
	@RequestParam(value="size", defaultValue = "1") Integer size){
		PageRequest request = PageRequest.of(page, size);
		Page<EnderecoDTO> lista = serv.find(request);
		return ResponseEntity.ok(lista);
	}
}
