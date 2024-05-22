package br.com.afrape.services;

import java.util.List;
import java.util.Optional;

import br.com.afrape.model.Frequencia;
import br.com.afrape.repositor.FrequenciaRepository;

public class FrequenciaService {

	private FrequenciaRepository frequenciaRepository;

	public Frequencia cadastroAluno(Frequencia frequencia) {
		// Cadastrar Frequencia
		return frequenciaRepository.save(frequencia);
	}
	
	public List<Frequencia> ListarFrequencia() {
		return frequenciaRepository.findAll();
	}

	public Frequencia atualizarFrequencia(Integer id, Frequencia frequenciaAtualizada) {
		Optional<Frequencia> optionalFrequencia = frequenciaRepository.findById(id);
		if (optionalFrequencia.isPresent()) {
			Frequencia frequencia = optionalFrequencia.get();
			frequencia.setRelatorio(frequenciaAtualizada.getRelatorio());
			return frequenciaRepository.save(frequencia);
		} else {
			return null;
		}
	}
}
