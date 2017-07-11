/**
 * 
 */
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
							'<td><progress id="'+i+'" max="40" value="15"></progress> 20 / 40</td>'+
							'</td> <td class="editar-link"> '+
							'<a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td> </tr>');
					totalAlunos(data[i].codigo, i);
				}
			},
		});
	}

	/*BUSCA O NÚMERO DE ALUNOS POR DISCIPLINA*/
	function totalAlunos(disciplina){
		var retorno = 0;
		$.ajax({
			type: 'GET',
			async: false,
			url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/countForDiscipline/'+disciplina,
			success: function(count){
				retorno = count;
				
			},
		});
		return retorno;
	}
	
	function teste() {
		totalAlunos(11, 10);
		alert(retorno);
		return retorno;
		
	}
	
	

	/* NÃO ESTÁ EM USO*/
	$(document).ready(function(){
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
						data[i].cargaHoraria+'</td> <td class="editar-link">'+
						'<a href="disciplina_editar.jsp"><span class="glyphicon glyphicon-pencil"></span> Editar</a></td> </tr>');
					
				}
			},
		});

	});