<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
	<%@include file="includes/head.jsp"%>
	
	<script type="text/javascript" src="js/grafico.js"></script>
	<script type="text/javascript" src="js/requisicao_disciplina.js"></script>
	<script type="text/javascript">
		$(document).ready(function(){
			//var valor = $("#g2").attr('value', 40);
			//alert(g2.value);
			//$("#"+idElemento).attr('value', count);
			
			
			/*
			g2 = new JustGage({
				id: "g2",
				value: 30,
				min: 0,
				max: 40,
				title: "Matemática",
				label: "Alunos"
			});
			*/
		});
	</script>

	<style>
		body {
			text-align: center;
		}

		#g1, #g2, #g3, #g4, #g5, #g6, #g7, #g8, #g9,{
			width:100px; height:80px;
			display: inline-block;
			margin: 1em;
		}

		p {
			display: block;
			width: 450px;
			margin: 2em auto;
			text-align: left;
		}
	</style>

</head>

<body >
	<div class="wrapper" role="main">
<script type="text/javascript">
	//alert(totalAlunos(9, 5));
</script>
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

						<div class="panel panel-default">
							<div class="panel-heading"> 
								<div class="panel-heading titulo-painel">
									<h2><center>Alunos por Disciplina</center></h2>
								</div>
							</div>
							<div class="panel-body">
								
								<a href="#"><div id="g1" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div></a>
								<div id="g2" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g3" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g4" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g5" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g6" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g7" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g8" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								<div id="g9" class="col-lg-2 col-md-6 col-sm-8 col-xs-12"></div>
								
								<script src="js/grafico/raphael-2.1.4.min.js"></script>
								<script src="js/grafico/justgage.js"></script>
								<script>
									var g1, g2, g3, g4, g5, g5, g6, g7, g8, g9;
							
									document.addEventListener("DOMContentLoaded", function(event) {
										g1 = new JustGage({
											id: "g1",
											value: totalAlunos(12),
											min: 0,
											max: 40,
											title: "Língua Portuguesa",
											label: "Alunos"
										});
										
										g2 = new JustGage({
											id: "g2",
											value: totalAlunos(10),
											min: 0,
											max: 40,
											title: "Matemática I",
											label: "Alunos"
										});

										g3 = new JustGage({
											id: "g3",
											value: totalAlunos(11),
											min: 0,
											max: 40,
											title: "Matemática II",
											label: "Alunos"
										});

										g4 = new JustGage({
											id: "g4",
											value: totalAlunos(13),
											min: 0,
											max: 40,
											title: "Álgebra",
											label: "Alunos"
										});

										g5 = new JustGage({
											id: "g5",
											value: totalAlunos(14),
											min: 0,
											max: 40,
											title: "Inglês",
											label: "Alunos"
										});

										g6 = new JustGage({
											id: "g6",
											value: totalAlunos(9),
											min: 0,
											max: 40,
											title: "História",
											label: "Alunos"
										});


										setInterval(function() {
											//g1.refresh(getRandomInt(0, 40));
											//g2.refresh(getRandomInt(0, 40));
											//g3.refresh(getRandomInt(0, 40));
											//g4.refresh(getRandomInt(0, 40));
											//g5.refresh(getRandomInt(0, 40));
											//g6.refresh(getRandomInt(0, 40));
											//g7.refresh(getRandomInt(0, 40));
											//g8.refresh(getRandomInt(0, 40));
											//g9.refresh(getRandomInt(0, 40));
										}, 2500);
									});
									
								</script>


								<!--<div id="chartContainer" style="height: 300px; width: 100%;"></div>-->

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