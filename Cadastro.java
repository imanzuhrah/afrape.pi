package br.com.afrape.model;


import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Aluno")
public class Cadastro {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;
	@Column(name = "Rg", nullable = true, length = 20)
	private String Rg;
	@Column(name = "Nis", nullable = true, length = 20)
	private String Nis;
	@Column(name = "endereco", nullable = true, length = 255)
	private String endereco;
	@Column(name = "bairro", nullable = true, length = 100)
	private String bairro;
	@Column(name = "cidade", nullable = true, length = 100)
	private String cidade;
	@Column(name = "responsavel", nullable = true, length = 100)
	private String responsavel;
	@Column(name = "telefone", nullable = true, length = 20)
	private String telefone;
	@Column(name = "whatsapp", nullable = true, length = 20)
	private String whatsapp;
	@Column(name = "escolaOrigem", nullable = true, length = 100)
	private String escolaOrigem;
	@Column(name = "serie", nullable = true, length = 50)
	private String serie;
	@Column(name = "Ra", nullable = true)
	private int Ra;
	@Column(name = "turma", nullable = true, length = 10)
	private String turma;
	@Column(name = "AnoEntrada", nullable = true)
	private String AnoEntrada;
	
	@Column(name = "relatorio", nullable = false, length = 150)
	private String relatorio;

	@Enumerated(EnumType.STRING)
	private CadastroStatus status;
	private Sexo statusSexo;
	private boolean apoio;
	private Date DataNasc;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return Rg;
	}
	public void setRg(String rg) {
		Rg = rg;
	}
	public String getNis() {
		return Nis;
	}
	public void setNis(String nis) {
		Nis = nis;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public String getEscolaOrigem() {
		return escolaOrigem;
	}
	public void setEscolaOrigem(String escolaOrigem) {
		this.escolaOrigem = escolaOrigem;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public int getRa() {
		return Ra;
	}
	public void setRa(int ra) {
		Ra = ra;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public String getAnoEntrada() {
		return AnoEntrada;
	}
	public void setAnoEntrada(String anoEntrada) {
		AnoEntrada = anoEntrada;
	}
	public CadastroStatus getStatus() {
		return status;
	}
	public void setStatus(CadastroStatus status) {
		this.status = status;
	}
	public Sexo getStatusSexo() {
		return statusSexo;
	}
	public void setStatusSexo(Sexo statusSexo) {
		this.statusSexo = statusSexo;
	}
	public boolean isApoio() {
		return apoio;
	}
	public void setApoio(boolean apoio) {
		this.apoio = apoio;
	}
	public Date getDataNasc() {
		return DataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		DataNasc = dataNasc;
	}
	public String getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(String relatorio) {
		this.relatorio = relatorio;
	}
	

	
}

