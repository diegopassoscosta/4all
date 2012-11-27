function confirmDel(cod) { 
        //var nom = nome.toUpperCase();
        if (window.confirm("Tem certeza que deseja excluir")) { 
                window.location.href = "listar_funcionario.jsp?excluirid_funcionario=" + cod;                 
        } else { 
                return false; 
        } 
} 
