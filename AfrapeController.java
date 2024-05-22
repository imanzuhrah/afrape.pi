package br.com.afrape.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.afrape.model.Cadastro;
import br.com.afrape.services.CadastroService;



@RestController
@RequestMapping("/api/controller")
public class AfrapeController {
	@Autowired
	private CadastroService cadastroService;
	
	@PostMapping
	public ResponseEntity<Cadastro> adicionarAluno(@RequestBody Cadastro cadastro) {
		Cadastro novoCadastro = cadastroService.cadastroAluno(cadastro);
		return new ResponseEntity<>(novoCadastro, HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cadastro> buscarPorId(@PathVariable Integer id) {
		Cadastro cadastro = cadastroService.buscarAlunoPorId(id);
		if (cadastro!=null) {
			return new ResponseEntity<>(cadastro, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/{id}") 
	public ResponseEntity<Cadastro>
	atualizarCadastro(@PathVariable Integer id, @RequestBody Cadastro cadastroAtualizado) {
		Cadastro cadas = cadastroService.atualizarCadastro(id, cadastroAtualizado);
		if(cadas != null) {
			return new ResponseEntity<>(cadas, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deletarCadastro(@PathVariable Integer id) {
		boolean deletado = cadastroService.deletarAluno(id);
		if (deletado) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping
	public ResponseEntity<List<Cadastro>> listarCadastro() {
		List<Cadastro> cad = cadastroService.ListarCadastro();
		return new ResponseEntity<>(cad, HttpStatus.OK);
	}
}

