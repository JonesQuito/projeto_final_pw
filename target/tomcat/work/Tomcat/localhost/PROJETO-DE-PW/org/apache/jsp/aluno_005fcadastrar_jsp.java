/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2017-05-19 17:44:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aluno_005fcadastrar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("/includes/rodape.jsp", Long.valueOf(1495215841000L));
    _jspx_dependants.put("/includes/aluno/aluno_faixa_opcoes.jsp", Long.valueOf(1495215841000L));
    _jspx_dependants.put("/includes/head.jsp", Long.valueOf(1495215841000L));
    _jspx_dependants.put("/menuLateral.jsp", Long.valueOf(1495215841000L));
    _jspx_dependants.put("/includes/cabecalho.jsp", Long.valueOf(1495215841000L));
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\n");
      out.write("<title>Gestor Acadêmico</title>\n");
      out.write("\n");
      out.write("<!-- Favicon -->\n");
      out.write("<link rel=\"shortcut icon\" href=\"/favicon.ico\" type=\"image/x-icon\">\n");
      out.write("<link rel=\"icon\" href=\"favicon.ico\" type=\"image/x-icon\">\n");
      out.write("\n");
      out.write("<!-- Bootstrap -->\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Meu estilo -->\n");
      out.write("<link rel=\"stylesheet\" href=\"css/estilo.css\">\n");
      out.write("\n");
      out.write("<!-- Fontes a serem utilizadas -->\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600,800|Roboto:400,500,900|Source+Sans+Pro:400,700\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<!-- Javascript e jQuery -->\n");
      out.write("<script src=\"js/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src='js/bootstrap.min.js' type=\"text/javascript\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("\t<!--############# Para rolar para o formulario #############-->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() { \n");
      out.write("\t\t\twindow.location.href='#conteudo';\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("\t<div class=\"wrapper\" role=\"main\">\n");
      out.write("\n");
      out.write("\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t<!--############# Linha Cabeçalho #############-->\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"row titulo\">\n");
      out.write("\t<div class=\"col-lg-12\">\n");
      out.write("\t\t<div class=\"img-logo-mobile hidden-lg hidden-md hidden-sm\">\n");
      out.write("\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t<img src=\"img/logo.png\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"img-logo hidden-xs\">\n");
      out.write("\t\t\t<a href=\"index.jsp\">\n");
      out.write("\t\t\t\t<img src=\"img/logo.png\">\n");
      out.write("\t\t\t</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t<!-- ############# FIM do Cabeçalho #############-->\n");
      out.write("\n");
      out.write("\t\t\t<!-- ############# Linha principal ############# -->\n");
      out.write("\t\t\t<div class=\"row margem-top-15px\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!--############# Menu Lateral #############-->\n");
      out.write("\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral\">\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-default menu-lateral\">\n");
      out.write("\t<div class=\"container-fluid\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("\t\t\t\tdata-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\"\n");
      out.write("\t\t\t\taria-controls=\"navbar\">\n");
      out.write("\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t\t<a class=\"navbar-brand hidden-lg hidden-md hidden-sm\" href=\"#\">MENU</a>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"navbar\" class=\"navbar-collapse collapse\">\n");
      out.write("\t\t\t<ul class=\"nav menu-lateral-mobile\">\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- HOME -->\n");
      out.write("\t\t\t\t<li><a href=\"index.jsp\"> <!-- Esse menu so parece para celular -->\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu_32/home_32px.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Home\"> <span>home</span>\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu/home.jpg\" alt=\"Menu Botï¿½o Home\">\n");
      out.write("\t\t\t\t\t\t\t<figcaption>home</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<!-- HOME -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ALUNOS -->\n");
      out.write("\t\t\t\t<li><a href=\"alunos.jsp\"> <!-- Esse menu so parece para celular -->\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu_32/aluno_32px.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Alunos\"> <span>alunos</span>\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu/aluno.jpg\" alt=\"Menu Botï¿½o Alunos\">\n");
      out.write("\t\t\t\t\t\t\t<figcaption>alunos</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<!-- ALUNOS -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- PROFESSORES -->\n");
      out.write("\t\t\t\t<li><a href=\"professores.jsp\"> <!-- Esse menu so parece para celular -->\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu_32/professor_32px.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Professores\"> <span>professores</span>\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu/professor.jpg\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Professores\">\n");
      out.write("\t\t\t\t\t\t\t<figcaption>professores</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<!-- PROFESSORES -->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- DISCIPLINA -->\n");
      out.write("\t\t\t\t<li><a href=\"disciplinas.jsp\"> <!-- Esse menu so parece para celular -->\n");
      out.write("\t\t\t\t\t\t<div class=\"figure_32 hidden-lg hidden-md hidden-sm\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu_32/disciplina_32px.png\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Disciplina\"> <span>disciplina</span>\n");
      out.write("\t\t\t\t\t\t</div> <!-- Esse menu so parece para tablet, notebook e desktop -->\n");
      out.write("\t\t\t\t\t\t<figure class=\"figure_115 hidden-xs\">\n");
      out.write("\t\t\t\t\t\t\t<img src=\"img/icones_menu/disciplina.jpg\"\n");
      out.write("\t\t\t\t\t\t\t\talt=\"Menu Botï¿½o Disciplina\">\n");
      out.write("\t\t\t\t\t\t\t<figcaption>disciplina</figcaption>\n");
      out.write("\t\t\t\t\t\t</figure>\n");
      out.write("\t\t\t\t</a></li>\n");
      out.write("\t\t\t\t<!-- DISCIPLINA -->\n");
      out.write("\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- nav-collapse -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- container-fluid -->\n");
      out.write("</nav>\n");
      out.write("<!-- navbar-default -->");
      out.write("\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--############# Menu Lateral #############-->\n");
      out.write("\n");
      out.write("\t\t\t\t<!--############# FAIXA DE OPÇÕES #############-->\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"col-lg-10 col-md-9 col-sm-8 col-xs-12 pesquisaBotoes\">\n");
      out.write("\t<!-- Pesquisar -->\n");
      out.write("\t<div class=\"row pesquisar\">\n");
      out.write("\t\t<form>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<div class=\"col-lg-9 col-md-8 col-sm-7 col-xs-10\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"pesquisar\"\n");
      out.write("\t\t\t\t\tplaceholder=\"Nome ou Matrícula\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\tclass=\"col-lg-2 col-md-3 col-sm-4 col-xs-1 hidden-xs btn btn-primary\">Pesquisar <span class=\"glyphicon glyphicon-search\"></span></button>\n");
      out.write("\t\t\t<button type=\"submit\"\n");
      out.write("\t\t\tclass=\"col-xs-1 hidden-lg hidden-md hidden-sm btn btn-primary botao-buscar-mobile\">\n");
      out.write("\t\t\t<span class=\"glyphicon glyphicon-search\"></span>\n");
      out.write("\t\t</button>\n");
      out.write("\t</form>\n");
      out.write("</div>\n");
      out.write("<!-- Pesquisar -->\n");
      out.write("\n");
      out.write("<!-- Botões de opções -->\n");
      out.write("<div id=\"opcoes\" class=\"row botoes\">\n");
      out.write("\t<div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("\t\t<a class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary \"\n");
      out.write("\t\thref=\"aluno_cadastrar.jsp\" role=\"button\"><span class=\"glyphicon glyphicon-plus\"></span> Cadastrar</a>\n");
      out.write("\t\t<a class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary\"\n");
      out.write("\t\thref=\"aluno_editar.jsp\" role=\"button\"><span class=\"glyphicon glyphicon-pencil\"></span> Editar</a>\n");
      out.write("\t\t<a class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary\"\n");
      out.write("\t\thref=\"aluno_excluir.jsp\" role=\"button\"><span class=\"glyphicon glyphicon-remove\"></span> Excluir</a>\n");
      out.write("\t\t<a class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12 btn btn-default btn-lg btn btn-primary\"\n");
      out.write("\t\thref=\"aluno_historico.jsp\" role=\"button\"><span class=\"glyphicon glyphicon-list-alt\"></span> Histórico</a>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<!-- Botões de opções -->\n");
      out.write("\n");
      out.write("</div>");
      out.write("\n");
      out.write("\t\t\t\t<!--############# FAIXA DE OPÇÕES #############-->\n");
      out.write("\n");
      out.write("\t\t\t\t<!-- ############# Conteudo ############# -->\n");
      out.write("\t\t\t\t<div class=\"col-lg-10 col-md-9 col-sm-8 col-xs-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t<!-- Div Conteudo -->\n");
      out.write("\t\t\t\t\t<div id=\"conteudo\">\n");
      out.write("\t\t\t\t\t\t<hr/>\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">Cadastro de Aluno</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-horizontal\" id=\"cadastraAluno\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarMatricula\">Matrícula</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-5 col-sm-9 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarMatricula\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Matrícula\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarNome\">Nome</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-7 col-sm-9 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarNome\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Nome\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarNascimento\">Nascimento</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-5 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input class=\"form-control\" id=\"cadastrarNascimento\" type=\"date\" value=\"aaaa-mm-dd\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tid=\"example-date-input\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarMae\">Mãe</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-7 col-sm-9 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarMae\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Nome da mãe\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarRG\">RG</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarRG\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"00.000.000-0\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarCPF\">CPF</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarCPF\" \n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"000.000.000-00\" name=\"cpf\" maxlength=\"14\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarCidade\">Cidade</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarCidade\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Cidade\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarCCEP\">CEP</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarCCEP\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"00.000-000\" name=\"cep\" maxlength=\"10\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarBairro\">Bairro</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarBairro\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Bairro\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarLogradouro\">Logradouro</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" id=\"cadastrarLogradouro\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Logradouro\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\" for=\"cadastrarNumero\">Número</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-2 col-md-3 col-sm-4 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"number\" class=\"form-control\" id=\"cadastrarNumero\"\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tplaceholder=\"Número\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<label class=\"col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label\"></label>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"col-lg-4 col-md-4 col-sm-6 col-xs-12\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<button class=\"col-lg-3 col-md-4 col-sm-6 col-xs-12 btn btn-primary\" type=\"submit\">Salvar</button>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div><!-- Painel corpo Conteudo -->\n");
      out.write("\t\t\t\t\t\t</div><!-- Painel -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<!-- FIM Div Conteudo -->\n");
      out.write("\n");
      out.write("\t\t\t\t</div><!-- conteudo -->\n");
      out.write("\t\t\t\t<!-- ############# FIM do conteudo ############# -->\n");
      out.write("\n");
      out.write("\t\t\t</div><!-- Linha principal -->\n");
      out.write("\t\t\t<!-- ############# FIM da Linha principal ############# -->\n");
      out.write("\n");
      out.write("\t\t\t<!-- ############# INÍCIO DO RODAPÉ ############# -->\n");
      out.write("\t\t\t");
      out.write("\n");
      out.write("\n");
      out.write("<footer>\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 rodape\">\n");
      out.write("            <p>Sistema de Gestão de alunos - 2017</p>\n");
      out.write("        </div>\n");
      out.write("        <!-- rodape -->\n");
      out.write("    </div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("\t\t\t<!-- ############# FIM DO RODAPÉ ############# -->\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- div container -->\n");
      out.write("\t</div>\n");
      out.write("\t<!-- div wrapper -->\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
