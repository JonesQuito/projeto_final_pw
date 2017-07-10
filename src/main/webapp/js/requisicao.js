$(document).ready(function(){
	$.ajax({
		type: 'GET',
		dataType: 'json',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/list',
		cache: false,
		success: function(data){
								  				
			$("#lista").append('<tr><th>Matrícula</th><th>Nome</th></tr>');
			
			for(i=0; i<data.length; i++){
				$("#lista").append('<tr> <td style="padding: 0px;">'+data[i].matricula
				+'</td> <td style="padding: 0px;">'+data[i].nome+'</td> </tr>');
			
			}
			$("#mat").attr("width") = 80;
			
		},
		error: function(erro){
			alert(erro);
		}
	});
});

function teste() {
	var dados = [{"matricula": 1, "nome": "Jones Quito"}, {"matricula": 2, "nome": "Simone Cardoso"}, {"matricula": 3, "nome": "Fernanda Chaves"}]	
	$("#tbl").text('');	
	for(i=0; i< dados.length; i++){
		$("#tbl").append('<tr><td style="padding: 0px;">'+dados[i].matricula+'</td><td style="padding: 0px;">'+dados[i].nome+'</td></tr>');
	}
}
/*BUSCA TODOS OS ALUNOS CADASTRADOS NO BANCO DE DADOS E LISTA EM UMA TABLE COM id=lista*/
function listarAlunos(){
	$.ajax({
		type: 'GET',
		dataType: 'json',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/list',
		cache: false,
		success: function(data){
			$("#lista").html('<table id="lista" class="table table-hover" style="padding: 0px;">');
			$("#lista").append('<tr style="padding: 0px;"></tr>');	
		
			$("#lista").append('</table>');	
			$("#lista").append('<tr><th>Matrícula</th><th>Nome</th></tr>');
			
			for(i=0; i<data.length; i++){
				$("#lista").append('<tr> <td style="padding: 0px;">'+data[i].matricula
				+'</td> <td style="padding: 0px;">'+data[i].nome+'</td> </tr>');
			
			}
			
		},
		error: function(erro){
			alert("Não foi possívle obter a lista de alunos");
		}
	});
}

/*PEGAR VALOR DA DISCIPLINA SELECIONADA*/
function pegarDisciplina(){
	var codDisciplina = $("#disciplina option:selected").val();
	var codAluno = $("#cadastrarMatricula").val();
	
	alert("Disciplina: " + codDisciplina + "  -- Aluno: " + codAluno);
}

/*MATRÍCULA DE ALUNO*/
function registrarMatricula(){
	var codDisciplina = $("#disciplina option:selected").val();
	var codAluno = $("#cadastrarMatricula").val();
	$.ajax({
		type: 'GET',
		dataType: 'json',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/matricula?codAluno='+codAluno+'&codDisciplina='+codDisciplina,
		cache: false,
		success: function(data){
			alert("Matrícula registrada com sucesso!");
			pesquisarPorDisciplina();
		},
		error: function() {
			alert("Não foi possível registrar a matrícula!!");
		}
	});
}

/*PESQUISAR POR DISCIPLINA*/
function pesquisarPorDisciplina(){
	var codDisciplina = $("#disciplina option:selected").val();
	
	$.ajax({
		type: 'GET',
		dataType: 'json',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/listForDiscipline?codDisciplina='+codDisciplina,
		cache: false,
		success: function(data){
			$("#lista").html('<table id="lista" class="table table-hover" style="padding: 0px;">');
			$("#lista").append('<tr style="padding: 0px;"></tr>');	
		
			$("#lista").append('</table>');	
			$("#lista").append('<tr><th>Matrícula</th><th>Nome</th></tr>');
			
			for(i=0; i<data.length; i++){
				$("#lista").append('<tr> <td style="padding: 0px;">'+data[i].matricula
				+'</td> <td style="padding: 0px;">'+data[i].nome+'</td> </tr>');
			
			}
			
		},
		error: function(erro){
			alert("Não foi possívle obter a lista de alunos");
		}
	});
	
}
//var itemSelecionado = $("#QtdAdomodacaoDuplo option:selected");






