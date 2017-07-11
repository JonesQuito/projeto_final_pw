<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@include file="includes/head.jsp"%>
</head>

<body>
	<div class="wrapper" role="main">

		<div class="container-fluid">

			<!--############# Linha Cabeçalho #############-->
			<%@include file="includes/cabecalho.jsp"%>
			<!-- ############# FIM do Cabeçalho #############-->

			<!-- ############# Linha principal ############# -->
			<div class="row margem-top-15px">

				<!--############# Menu Lateral #############-->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!--############# Menu Lateral #############-->


				<!-- ############# Conteudo ############# -->
				<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<!--############# TÍTULO PÁGINA #############-->

					<!--############# FIM TÍTULO PÁGINA #############-->
					
					<!--############# FAIXA DE OPÇÕES #############-->
					<%@include file="includes/matricula/matricula_faixa_opcoes.jsp"%>
					<!--############# FAIXA DE OPÇÕES #############-->

					<!-- Div Conteudo -->
					<div class="conteudo">

						<!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->
						<%@include file="includes/confirmar_excluir.jsp"%>
						<!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->
						
						<a href="aluno_grafico.jsp">TESTE GRAFICO</a>

						<div class="panel panel-default">
							<div class="panel-heading"> 
								<div class="panel-heading titulo-painel">
									<h2><center>Matrículas Registradas</center></h2>
								</div>
							</div>
							<div class="panel-body">

								<div class="table-responsive" style="box-shadow: 0px 0px 5px rgba(0,0,0,.5);">
									
									<table class="table table-hover">
										<h6 class="hidden-lg hidden-md hidden-sm"> [Role a tabela lateralmente se necessário]<h6>
											<tr>
												<th>Aluno</th>
												<th>Disciplina</th>
												<th>Status da Matrícula</th>
												<th>Data</th>
												<th colspan="2">Editar e Excluir</th>

												<c:forEach var="matricula" items="${matriculas}" varStatus="contador">
												<tr bgcolor="#${contador.count %2 == 0? 'fcfcfc': 'ffffff' }">

													<td>${matricula.nomeAluno}</td>
													<td>${matricula.nomeDisciplina}</td>
													<td>${matricula.status}</td>
													<td><fmt:formatDate value="${matricula.dataMatricula.time}" pattern="dd/MM/yyyy"/></td>

													<td class="editar-link" alt="Editar"><a href="servletaluno?logica=AlunoEditar&operacao=buscar&matricula=${aluno.matricula}">
													</a></td>
													<td class="excluir-link"><a href="servletaluno?logica=AlunoExcluir&matricula">
													</a></td>
												</tr>
											</c:forEach>
										</table>
									</div><!-- Tabela Responsiva -->

								</div><!-- Painel corpo Conteudo -->
							</div><!-- Painel -->


						</div>
						<!-- FIM Div Conteudo -->

					</div><!-- conteudo -->
					<!-- ############# FIM do conteudo ############# -->

				</div><!-- Linha principal -->
				<!-- ############# FIM da Linha principal ############# -->

				<!-- ############# INÍCIO DO RODAPÉ ############# -->
				<%@ include file="includes/rodape.jsp"%>
				<!-- ############# FIM DO RODAPÉ ############# -->

			</div>
			<!-- div container -->
		</div>
		<!-- div wrapper -->


	</body>
	</html>