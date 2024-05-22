package br.com.afrape.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.afrape.model.Cadastro;
import br.com.afrape.model.Frequencia;
import br.com.afrape.repositor.CadastroRepository;
import br.com.afrape.repositor.FrequenciaRepository;


@Configuration
//@Profile("dev")

public class CarregaBaseDados {
		
		
		@Autowired
		private CadastroRepository cadastroRepository;
		
		@Autowired
		private FrequenciaRepository frequenciaRepository;
		
		
		@Bean
		CommandLineRunner executar() {
			//return args ->{
				ModuloConexao mcon = new ModuloConexao();
				mcon.conexao();
			//}

			// Método CREATE (CRUD)
			public void criar(Cadastro cadastro) {
				String sql = "INSERT INTO Aluno (Nome, DataNascimento, Rg, NIS, Endereco, Bairro, Cidade, Responsavel, "
						+ "Telefone, WhatsApp, Sexo, Escola, Origem, Serie, RA, Apoio, Turma, AutoEntrada, Status)" 
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
				
				

				try {
					
					
					cadastro.setNome(cadastro.getNome());
					cadastro.setDataNasc(cadastro.getDataNasc());
					cadastro.setRg(cadastro.getRg());
					cadastro.setNis(cadastro.getNis());
					cadastro.setEndereco(cadastro.getEndereco());
					cadastro.setBairro(cadastro.getBairro());
					cadastro.setCidade(cadastro.getCidade());
					cadastro.setResponsavel(cadastro.getResponsavel());
					cadastro.setTelefone(cadastro.getTelefone());
					cadastro.setWhatsapp(cadastro.getWhatsapp());
					cadastro.setStatusSexo(cadastro.getStatusSexo());
					cadastro.setEscolaOrigem(cadastro.getEscolaOrigem());
					cadastro.setSerie(cadastro.getSerie());
					cadastro.setRa(cadastro.getRa());
					cadastro.setApoio(cadastro.isApoio());
					cadastro.setTurma(cadastro.getTurma());
					cadastro.setAnoEntrada(cadastro.getAnoEntrada());
					cadastro.setStatus(cadastro.getStatus());
					cadastroRepository.save(cadastro);
					

					
				} catch (Exception e) {
					
					System.out.println(e);

				}
			}
			
				
				
			public void criar(Frequencia frequencia) {
				String sql = "INSERT INTO Frequencia (IdAluno, Data, Atividade, Presente)" 
						+ "VALUES(?,?,?,?)";
				
				
				frequencia.setIdAluno(frequencia.getIdAluno());
				frequencia.setData(frequencia.getData());
				frequencia.setAtividade(frequencia.getAtividade());
				frequencia.setPresenca(frequencia.isPresenca());
				frequenciaRepository.save(frequencia);
			};
		}
		
		
		// Método Read CRUD

		public List<Cadastro> listar() {
			List<Cadastro> listaCadastro = new ArrayList<Cadastro>();
			
			Cadastro cad = new Cadastro();

			String sql = "Select * from Aluno";
			try {
					
				cad.getNome("nome");
				cad.getDataNasc("dataNasc");
				cad.getRg("Rg");
				cad.getNis("Nis");
				cad.getEndereco("endereco");
				cad.getBairro("bairro");
				cad.getCidade("cidade");
				cad.getResponsavel("responsavel");
				cad.getTelefone("telefone");
				cad.getWhatsapp("whatsApp");
				cad.getStatusSexo("statusSexo");
				cad.getEscolaOrigem("escolaOrigem");
				cad.getSerie("serie");
				cad.getRa("Ra");
				cad.isApoio("apoio");
				cad.getTurma("turma");
				cad.getAnoEntrada("anoEntrada");
				cad.getStatus("status");
			
				
					listaCadastro.add(cad);
				}
				

			} catch (Exception e) {
				System.out.println(e);
			}
			
			
			public List<Frequencia> listarFreq() {
				List<Frequencia> listaFrequencia = new ArrayList<Frequencia>();
				
				Frequencia freq = new Frequencia();

				String sql = "Select * from Frequencia";
				try {
						
					freq.getIdAluno("idAluno");
					freq.getData("data");
					freq.getAtividade("atividade");
					freq.isPresenca("presenca");
					
						listaFrequencia.add(freq);
					}
					

				} catch (Exception e) {
					System.out.println(e);
				}
				
		}

//Método Update CRUD
	//Selecionar por id
	
	public Cadastro selecionarPorId(Cadastro cadastro) {
		
		String sql = "Select * from Aluno where id=?";
		try {
			
			cadastro.setInt(1, cadastro.getId());
			
			if {
				
				cadastro.setNome(cadastro.getNome("nome"));
				cadastro.setDataNasc(cadastro.getDataNasc("dataNasc"));
				cadastro.setRg(cadastro.getRg("Rg"));
				cadastro.setNis(cadastro.getNis("Nis"));
				cadastro.setEndereco(cadastro.getEndereco("endereco"));
				cadastro.setBairro(cadastro.getBairro("bairro"));
				cadastro.setCidade(cadastro.getCidade("cidade"));
				cadastro.setResponsavel(cadastro.getResponsavel("responsavel"));
				cadastro.setTelefone(cadastro.getTelefone("telefone"));
				cadastro.setWhatsapp(cadastro.getWhatsapp("whatsApp"));
				cadastro.setStatusSexo(cadastro.getStatusSexo("statusSexo"));
				cadastro.setEscolaOrigem(cadastro.getEscolaOrigem("escolaOrigem"));
				cadastro.setSerie(cadastro.getSerie("serie"));
				cadastro.setRa(cadastro.getRa("Ra"));
				cadastro.setApoio(cadastro.isApoio("apoio"));
				cadastro.setTurma(cadastro.getTurma("turma"));
				cadastro.setAnoEntrada(cadastro.getAnoEntrada("anoEntrada"));
				cadastro.setStatus(cadastro.getStatus());
			}
			
		} catch (Exception e) {
			System.out.println(e);
			
		} return cadastro;
	}
	
public Frequencia selecionarPorId(Frequencia frequencia) {
		
		String sql = "Select * from Aluno where id=?";
		try {
			
			frequencia.setInt(1, frequencia.getIdAluno());
			
			if {
				
				frequencia.setIdAluno(frequencia.getIdAluno("idAluno"));
				frequencia.setData(frequencia.getData("data"));
				frequencia.setAtividade(frequencia.getAtividade("atividade"));
				frequencia.setPresenca(frequencia.isPresenca("presenca"));
			}
			
		} catch (Exception e) {
			System.out.println(e);
			
		} return cadastro;
	}
	

	
	
}
