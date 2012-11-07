function msgAlert(){
		if(confirm("Deseja realmente excluir?"))
		{
			return true;
		}
		else
		{
			return false;
		}
}
	
function criarInputFoto(param, divText, divLabel){
	var qtd
	var html

	qtd = param.value;
	html = "";
	
	if(qtd == 0){
		alert("Quantidade inválida!");
		param.value = 1;
		param.focus();
		return false;
	}

	if (qtd > 3){

		alert("S&oacute; &eacute; poss&iacute;vel inserir 3 fotos por vez!");

		param.value = 1;
		param.focus();

		return false;
	}

	for (var c=1; c <= qtd; c++){
		html = html + "<input name='img" + c + "' type='file' class='input_texto' size='50' maxlength='100' validationmsg='Insira a imagem' /><br>";
		html = html + "<input type='text' name='descricaoimg[]' class='input_texto' size='50' maxlength='70'><br><br>";
		//alert(html);
	}
	document.getElementById( divText ).innerHTML = html;
	document.getElementById( divLabel ).innerHTML = "Imagen(s):";
}

function criarInputFotoAEmpresa(param, divText, divLabel){
	var qtd
	var html

	qtd = param.value;
	html = "";
	
	if(qtd == 0){
		alert("Quantidade inválida!");
		param.value = 1;
		param.focus();
		return false;
	}

	if (qtd > 3){

		alert("S&oacute; &eacute; poss&iacute;vel inserir 3 fotos por vez!");

		param.value = 1;
		param.focus();

		return false;
	}

	for (var c=1; c <= qtd; c++){
		html = html + "<input name='img" + c + "' type='file' class='input_texto' size='50' maxlength='100' validationmsg='Insira a imagem.' /><br>";
		
		//alert(html);
	}
	document.getElementById( divText ).innerHTML = html;
	document.getElementById( divLabel ).innerHTML = "Passeio(s):";
}

function AbreJanela(url, nomejan, opcoes){             
        window.open(url, nomejan, opcoes); 
    }

//Imprime a data atual 
function mostraData(){
		var mes = new Array("Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho","Agosto","Setembro","Outubro","Novembro","Dezembro");
		var NomeDia = new Array("Domingo", "Segunda-feira", "Terça-feira","Quarta-feira","Quinta-feira","Sexta-feira","Sábado"); 
		
		var dia = new Date;
		var ano = dia.getYear();
		
		if(ano < 2000)
		{
		ano = ano + 1900;
		}
		
		var data = NomeDia[dia.getDay()] + ", " + dia.getDate() + " de " + mes[dia.getMonth()] + " de " + ano; 
		
		document.write(data);
	}
	
function checa(nform) {
	if (nform.email.value != "") {
		
		prim = nform.email.value.indexOf("@")
		if(prim < 2) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("@",prim + 1) != -1) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf(".") < 1) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf(" ") != -1) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("zipmeil.com") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("hotmeil.com") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf(".@") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("@.") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf(".com.br.") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("/") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("[") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("]") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("(") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf(")") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
		if(nform.email.value.indexOf("..") > 0) {
			alert("O e-mail informado parece não estar correto.");
			nform.email.focus();
			nform.email.select();
			return false;
		}
	}
		return true;
}	

function resizeFields(){
	var e = document.getElementsByTagName('input');
	
	for(var i = 0; i < e.length; i++){
		if(e[i].type == 'text' && e[i].size > 0 && e[i].size <= 100 && e[i].size != 20){
			e[i].style.width = e[i].size+'%';
		}
		e[i].style.marginRight = 'auto';
	}
	
	var o = document.getElementsByTagName('select');

	for(var i = 0; i < o.length; i++){
		o[i].style.marginRight = 'auto';
	}
}
