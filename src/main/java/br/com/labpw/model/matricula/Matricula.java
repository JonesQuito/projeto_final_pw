package br.com.labpw.model.matricula;

import java.util.Calendar;

public class Matricula {
	
	public static final int STATUS_ABERTO = 1;
	public static final int STATUS_FECHADO = 0;
	
	private int codAluno;
	private int codDisciplina;
	private int status;
	private Calendar dataMatricula;
	
	public int getCodAluno(){
		return this.codAluno;
	}
	
	public void setCodAluno(int codAluno) {
		this.codAluno = codAluno;
	}

	public int getCodDisciplina() {
		return codDisciplina;
	}

	public void setCodDisciplina(int codDisciplina) {
		this.codDisciplina = codDisciplina;
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
