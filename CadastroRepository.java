package br.com.afrape.repositor;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.afrape.model.Cadastro;


public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

}
