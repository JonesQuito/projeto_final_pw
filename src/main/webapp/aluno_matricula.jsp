<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<%@include file="includes/head.jsp"%>

<style type="text/css">			
.borda {
	box-shadow: 0px 0px 5px rgba(0, 0, 0, .5);
	padding: 10px;
}
</style>
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
				<!--############# FAIXA DE OPÇÕES #############-->
					<%@include file="includes/aluno/aluno_faixa_opcoes.jsp"%>
				<!--############# FAIXA DE OPÇÕES #############-->



					<!-- Div Conteudo -->
					<div class="conteudo"> <hr /> 

					<div class="panel panel-default" style="width: 100%; margin: auto;">
						<div class="panel-heading titulo-painel">
							<!--############# TÍTULO PÁGINA #############-->

							<!-- %@include file="includes/aluno/aluno-titulo-pagina.jsp"% -->
							<div class="row titulo-pagina">
								<div class="conteudo-h1">
									<h4>
										<span class="glyphicon glyphicon-user"></span> MATRÍCULA DE
										ALUNO
									</h4>
								</div>
							</div>

							<!--############# FIM TÍTULO PÁGINA #############-->

						</div>
						<div class="panel-body">
							<!-- div começa aqui -->

							<div class="formulario col-lg-5 borda">

								<form class="form-horizontal" id="cadastraAluno">
									<!-- class="form-horizontal" -->

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"
											for="cadastrarMatricula">Matrícula</label>
										<div class="col-lg-12 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control"
												id="cadastrarMatricula" placeholder="Matrícula">
										</div>
									</div>

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"
											for="cadastrarNome">Nome</label>
										<div class="col-lg-12 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarNome"
												placeholder="Nome">
										</div>
									</div>

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"
											for="cadastrarNascimento">Nascimento</label>
										<div class="col-lg-12 col-md-3 col-sm-5 col-xs-12">
											<input class="form-control" id="cadastrarNascimento"
												type="date" value="aaaa-mm-dd" id="example-date-input">
										</div>
									</div>

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"
											for="cadastrarMae">Mãe</label>
										<div class="col-lg-12 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarMae"
												placeholder="Nome da mãe">
										</div>
									</div>

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"
											for="cadastrarCPF">CPF</label>
										<div class="col-lg-12 col-md-3 col-sm-4 col-xs-12">
											<input type="text" class="form-control" id="cadastrarCPF"
												placeholder="000.000.000-00" name="cpf" maxlength="14">
										</div>
									</div>

									<div class="form-group">
										<label
											class="col-lg-2 col-md-2 col-sm-3 col-xs-1"></label>
										<div  style="margin: auto;">
											
											<button
												class="col-lg-8 col-md-4 col-sm-6 col-xs-12 btn btn-primary"
												type="button">Buscar
											</button>
											
												
										</div>
									</div>

								</form>
							</div>

							<div class="button-add col-lg-1">
								<button style="padding: 5px; margin-top: 180px;"
									class="col-lg-8 btn btn-primary"
									type="button"><span 
									class="glyphicon glyphicon-arrow-right" 
									data-unicode="e092"></span>
								</button>
							
							</div>

							<div class="select-curso col-lg-6 borda"
								style="position: relative; float: right;">

								<div class="form-group">
									<label for="curso">Selecionar Curso</label> 
										<select class="form-control" name="curso" id="curso">
										<option>Matemática</option>
										<option>Português</option>
										<option>História</option>
									</select>
								</div>
								 
								<hr style="background-color: blue;
										   height: 1px;"/>
								 
								<div class="table-responsive borda">
									<table class="table table-hover" style="padding: 0px;">
										<tr>
											<th style="padding: 0px;">Matr</th>
											<th style="padding: 0px;">Nome</th>
										</tr>
										<tr style="padding: 0px;">
											<td style="padding: 0px;">001</td>
											<td style="padding: 0px;">Caio Benício Lorenzo Castro</td>											
										</tr>
										<tr >
										<td style="padding: 0px;">002</td>
											<td style="padding: 0px;">Carlos Eduardo Alexandre Miguel Pinto</td>
										</tr>
									</table>
								</div><!-- Tabela Responsiva -->
								<br />
					
							</div>


							<!-- termina aqui -->
						</div>
						<!-- Fim do panel-body -->
					</div>
					<!-- Painel -->
					<!-- </div>  -->
					<!-- FIM Div Conteudo -->

				</div>
				<!-- conteudo -->
				<!-- ############# FIM do conteudo ############# -->

			</div>
			<!-- Linha principal -->
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