<?
require_once("../lib/secao.php");
?>
<script language="JavaScript1.2" src="../js/jquery.js" type="text/javascript"></script>
<script language="JavaScript1.2" src="../js/interface.js" type="text/javascript"></script>

<!--[if lt IE 7]>
<style type="text/css">
    .dock img { behavior: url(../css/iepngfix.htc) }
</style>
<![endif]-->
  
<div class="dock" id="dock">
    <div class="dock-container">
        <a class="dock-item" href="principal.php">
        	<img src="../img/home.png" /><span>Home</span>
        </a>
        <!-- a class="dock-item" href="principal.php?view=paises&link=index">
        	<img src="../img/pais4.png" /><span>País</span>
        </a-->
        <a class="dock-item" href="principal.php?view=estados&link=index">
        	<img src="../img/estados.png" /><span>Estado</span>
        </a>
        <a class="dock-item" href="principal.php?view=municipios&link=index">
        	<img src="../img/cidade.png" /><span>Município</span>
        </a>
        <a class="dock-item" href="principal.php?view=clientes&link=index">
        	<img src="../img/clientes.png" /><span>Clientes</span>
        </a>
        <a class="dock-item" href="principal.php?view=usuarios&link=index">
        	<img src="../img/usuario.png" /><span>Usuários</span>
        </a>
        <a class="dock-item" href="principal.php?view=produtos&link=index">
        	<img src="../img/planos.png" /><span>Produtos</span>
        </a>        
        <a class="dock-item" href="principal.php?view=marcas&link=index">
        	<img src="../img/grupos.png"/><span>Marcas</span>
        </a>
        <a class="dock-item" href="principal.php?view=categorias&link=index">
        	<img src="../img/gruposEmail.png"/><span>Categorias</span>
        </a>
        <a class="dock-item" href="principal.php?view=pedidos&link=index">
        	<img src="../img/contatosEmail.png"/><span>Pedidos</span>
        </a>
    </div> 
</div>
<script type="text/javascript">
    $(document).ready(
        function(){
            $('#dock').Fisheye({
                    maxWidth: 30,
                    items: 'a',
                    itemsText: 'span',
                    container: '.dock-container',
                    itemWidth: 50,
                    proximity: 50,
                    halign : 'center'
            })
        }
    );
</script>