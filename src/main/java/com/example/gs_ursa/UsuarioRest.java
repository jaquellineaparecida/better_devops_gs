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
@RequestMapping(value = "/usuario")
public class UsuarioRest {

	@Autowired
	private UsuarioRepository rep;
	
	@Autowired
	private UsuarioDTOService serv;
	
	//Insert
	@Operation(description = "Este serviço insere um novo usuário")
	@PostMapping
	public Usuario insert(@Valid @RequestBody Usuario u) {
		rep.save(u);
		return u;
	}
	
	//GetAll
	@Operation(description = "Retorna todos os usuários")
	@GetMapping(value = "/todos")
	public List<Usuario> buscaTodos(){
		return rep.findAll();
	}
	
	//Update
	@Operation(description = "Este serviço atualiza um usuário")
	@PutMapping(value = "/atualizar/{id}")
	public void update(@PathVariable Long id, @RequestBody Usuario u) {

		Usuario u1 = rep.findById(id).get();

		u1.setNm_completo(u.getNm_completo());
		u1.setDt_nascimento(u.getDt_nascimento());
		u1.setDes_cpf(u.getDes_cpf());
		u1.setDes_telefone(u.getDes_telefone());
		u1.setDes_email(u.getDes_email());
		u1.setDes_senha(u.getDes_senha());

		rep.save(u1);
	}
	
	//Delete
	@Operation(description = "Este serviço remove um usuário")
	@DeleteMapping(value = "/deletar/{id}")
	public void apagarUsuarioById(@PathVariable Long id) {
		rep.deleteById(id);
	}
	
	//Paginação
	@Operation(description = "Retorna os usuários paginados")
	@GetMapping(value = "/todos_paginados")
	public ResponseEntity<Page<UsuarioDTO>>
	buscaUsuariosPaginados(@RequestParam(value="page",defaultValue = "0") Integer page,
	@RequestParam(value="size", defaultValue = "1") Integer size){
		PageRequest request = PageRequest.of(page, size);
		Page<UsuarioDTO> lista = serv.find(request);
		return ResponseEntity.ok(lista);
	}
}
