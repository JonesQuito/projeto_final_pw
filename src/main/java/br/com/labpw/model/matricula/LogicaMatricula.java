package br.com.labpw.model.matricula;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LogicaMatricula {
	
	String executa(HttpServletRequest request, HttpServletResponse response) throws Exception;

}
