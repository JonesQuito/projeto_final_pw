/**
 * 
 */
function totalAlunosDisciplina(codDisciplina){
	$.ajax({
		type: 'GET',
		dataType: 'json',
		url: 'http://localhost:9090/PROJETO-DE-PW/api/aluno/listForDiscipline?codDisciplina=11',
		cache: false,
		success: function(data){
			alert(data.length);
			return data.length;
		}
	});
}

function teste(cod){
	//alert(parseInt(totalAlunosDisciplina(cod)));
	return parseInt(totalAlunosDisciplina(cod));
}