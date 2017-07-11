package br.com.labpw.model.matricula;

import java.util.Calendar;

public class Matricula2 {
	
	private String nomeAluno;
	private String nomeDisciplina;
	private int status;
	private Calendar dataMatricula;
	
	
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Calendar getDataMatricula() {
		return dataMatricula;
	}
	public void setDataMatricula(Calendar dataMatricula) {
		this.dataMatricula = dataMatricula;
	}
	
	

}
