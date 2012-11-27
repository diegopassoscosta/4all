function Enum(num){
	if (document.all)
		var tecla = event.keyCode;
		else if(document.layers)
		var tecla = num.which;
		if (tecla > 47 && tecla < 58)
			return true;
		else
		{
			if (tecla != 8)
			event.keyCode = 0;
			else
			return true;
		}
}
