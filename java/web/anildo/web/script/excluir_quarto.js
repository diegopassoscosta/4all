function confirmDel(cod) { 
        //var nom = nome.toUpperCase();
        if (window.confirm("Tem certeza que deseja excluir")) { 
                window.location.href = "listar_quartos.jsp?excluirid_quarto=" + cod; 
        } else { 
                return false; 
        } 
} 
