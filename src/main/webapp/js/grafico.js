/**
 * 
 */
function totalAlunosDisciplina(codDisciplina){
	$.ajax({
		type: 'GET',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/countForDiscipline/'+codDisciplina,
		cache: false,
		success: function(total){
			var number = parseInt(total);
			return number;
		}
	});
}

function teste(){
	alert("dfsfffdfkd");
}