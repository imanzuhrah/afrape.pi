package br.com.afrape.model;


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
@Table(name = "frequencia")

public class Frequencia {

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Integer id;

		@Column(name = "idAluno", nullable = false)
		private int idAluno;
		@Column(name = "atividade", nullable = true)
		private int atividade;
		
		@Column(name = "relatorio", nullable = false, length = 150)
		private String relatorio;
		
		@Enumerated(EnumType.STRING)
		private boolean presenca;
		private LocalDate Data;
		
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public int getIdAluno() {
			return idAluno;
		}
		public void setIdAluno(int idAluno) {
			this.idAluno = idAluno;
		}
		public int getAtividade() {
			return atividade;
		}
		public void setAtividade(int atividade) {
			this.atividade = atividade;
		}
		public boolean isPresenca() {
			return presenca;
		}
		public void setPresenca(boolean presenca) {
			this.presenca = presenca;
		}
		public LocalDate getData() {
			return Data;
		}
		public void setData(LocalDate data) {
			Data = data;
		}
		public String getRelatorio() {
			return relatorio;
		}
		public void setRelatorio(String relatorio) {
			this.relatorio = relatorio;
		}
		
		
		
}
