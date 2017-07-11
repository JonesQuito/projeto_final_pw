<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <%@include file="includes/head.jsp"%>
 <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>   
<script type="text/javascript">
	
	function listarDisciplinas(){
		$.ajax({
			type: 'GET',
			dataType: 'json',
			url: 'http://localhost:9090/PROJETO-DE-PW/api/disciplina/list',
			cache: false,
			success: function(data){
				for(i=0; i < data.length; i++){
					
					$("#lista").append('<tr> <td>'+
							data[i].codigo+'</td> <td>'+
							data[i].nome+'</td> <td>'+
							data[i].cargaHoraria+
							'<td><progress id="'+i+'" max="40" value=""></progress> <span id="'+(i+'sp')+'"></span> / 40</td>'+
							'</td> <td class="editar-link"> '+
							'<a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td> </tr>');
					totalAlunos(data[i].codigo, i, i+'sp');
				}
			},
		});
	}
	
	/*BUSCA O NÚMERO DE ALUNOS POR DISCIPLINA*/
	function totalAlunos(disciplina, idElemento, idElemento2){
		$.ajax({
			type: 'GET',
			url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/countForDiscipline/'+disciplina,
			cache: false,
			success: function(count){

				$("#"+idElemento).attr('value', count);
				$("#"+idElemento2).text(count);
				
			},
		});
	}
</script>
</head>

<body onload="listarDisciplinas()">

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


                <!--############# FAIXA DE OPÇÕES #############-->
                <%@ include file="includes/disciplina/disciplina_faixa_opcoes_listar.jsp"%>
                <!--############# FAIXA DE OPÇÕES #############-->

                <!-- Div Conteudo -->
                <div class="conteudo">

                    <!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->
                    <%@include file="includes/confirmar_excluir.jsp"%>
                    <!--############# MODAL CONFIRMAÇÃO DE EXCLUSÃO #############-->

                    <div class="panel panel-default">
                        <div class="panel-heading titulo-painel">
                            <h2><center>Lista de Disciplinas</center></h2>
                        </div>
                        <div class="panel-body">
                            <div class="table-responsive">
                            	<h6 class="hidden-lg hidden-md hidden-sm">[Role a tabela lateralmente se necessário]</h6>
                                <table class="table table-houve" id="lista">

                                    <tr>
                                        <th>Código</th>
                                        <th>Nome</th>
                                        <th>Duração</th>
                                        <th>Vagas</th>
                                        <th colspan="2">Ações</th>
                                    </tr>

                                                                         
                                </table>
                            </div><!-- Tabela Responsiva -->

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

        <!-- Linha rodape -->

        <!-- ############# INÍCIO DO RODAPÉ ############# -->
        <%@ include file="includes/rodape.jsp"%>
        <!-- ############# FIM DO RODAPÉ ############# -->

    </div>
    <!-- div container -->
</div>
<!-- div wrapper -->


</body>
</html>