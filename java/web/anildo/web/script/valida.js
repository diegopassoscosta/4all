function ValidarCampos(f){				
    for (i=0; i<f.length-2; i++){        
            if(f.elements[i].id == "1"){
                if( f.elements[i].value == "" ){
                    f.elements[i].value = "";
                    alert("Campo "+ f.elements[i].name +" é Obrigatório.");
                    f.elements[i].style.backgroundColor="#92CFEC";
                    f.elements[i].focus();
                    return false;
                }                               
            }                        
    }
    f.submit();
}