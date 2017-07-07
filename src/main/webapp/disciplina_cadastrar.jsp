<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@include file="includes/head.jsp"%>

	<!--############# Para rolar para o formulario #############-->
	<script type="text/javascript">
		$(document).ready(function() { 
			window.location.href='#conteudo';
		});
	</script>
	

</head>

<body>

	<div class="wrapper" role="main">

		<div class="container-fluid">

			<!--############# Linha Cabeçalho #############-->
			<%@include file="includes/cabecalho.jsp"%>
			<!-- ############# FIM do Cabeçalho #############-->

			<!-- ############# Linha principal ############# -->
			<div class="row margem-top-15px">

				<!-- Menu Lateral -->
				<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12 menu-lateral">
					<%@include file="menuLateral.jsp"%>
				</div>
				<!-- Menu Lateral -->

				<!-- ############# Conteudo ############# -->
				<div class="col-lg-10 col-md-9 col-sm-8 col-xs-12">

					<!--############# TÍTULO PÁGINA #############-->
					<%@include file="includes/disciplina/disciplina-titulo-pagina.jsp"%>
					<!--############# FIM TÍTULO PÁGINA #############-->

					<!-- Div Conteudo -->
					<div id="conteudo">
						<hr/>
						<div class="panel panel-default">
							<div class="panel-heading titulo-painel">
								<center><h2>Cadastro</h2></center>
							</div>
							<div class="panel-body">

								<form class="form-horizontal" id="form1" method="post" action="servletdisciplina?logica=DisciplinaInserir">

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Código</label>
										<div class="col-lg-2 col-md-3 col-sm-5 col-xs-12">
											
											<input type="text" class="form-control" id="cadastrarCodigo" name="codigo"
											placeholder="Código" maxlength="5" required="true">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Nome</label>
										<div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
											<input type="text" class="form-control" id="cadastrarNome" name="nome"
											placeholder="Nome" maxlength="30">
										</div>
									</div>
									
									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Carga Horária</label>
										<div class="col-lg-2 col-md-3 col-sm-4 col-xs-12">
											<input type="text" class="form-control" id="cadastrarDuracao" name="duracao"
											placeholder="Carga Horária" maxlength="3">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label">Descrição</label>
										<div class="col-lg-4 col-md-7 col-sm-9 col-xs-12">
											<textarea class="form-control" id="cadastrarDescricao" name="descricao"
											placeholder="Descrição" rows="5" cols="50" maxlength="250"></textarea>
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 col-md-2 col-sm-3 col-xs-1 control-label"></label>
										<div class="col-lg-4 col-md-4 col-sm-6 col-xs-12">
											<button class="col-lg-3 col-md-4 col-sm-6 col-xs-12 btn btn-primary" type="submit">Salvar</button>
										</div>
									</div>

								</form>

							</div><!-- Painel corpo Conteudo -->
						</div><!-- Painel -->

					</div>
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