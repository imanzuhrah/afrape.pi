package br.com.afrape.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.afrape.model.Cadastro;
import br.com.afrape.repositor.CadastroRepository;


@Service
public class CadastroService {

	private CadastroRepository cadastroRepository;

	public Cadastro cadastroAluno(Cadastro cadastro) {
		// Cadastrar Aluno
		return cadastroRepository.save(cadastro);
	}

	public Cadastro buscarAlunoPorId(Integer id) {
		Optional<Cadastro> optionalCadastro = cadastroRepository.findById(id);
		return optionalCadastro.orElse(null);
	}

	public List<Cadastro> ListarCadastro() {
		return cadastroRepository.findAll();
	}

	public Cadastro atualizarCadastro(Integer id, Cadastro cadastroAtualizado) {
		Optional<Cadastro> optionalCadastro = cadastroRepository.findById(id);
		if (optionalCadastro.isPresent()) {
			Cadastro cadastro = optionalCadastro.get();
			cadastro.setRelatorio(cadastroAtualizado.getRelatorio());
			return cadastroRepository.save(cadastro);
		} else {
			return null;
		}
	}

	public boolean deletarAluno(Integer id) {
		if (cadastroRepository.existsById(id)) {
			cadastroRepository.deleteById(id);
			return true;
		} else {
			return false;
		}
	}
	
	
}
