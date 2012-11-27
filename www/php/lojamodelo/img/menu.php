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
        <a class="dock-item" href="principal.php"><img src="../img/gohome2.png" /><span>Home</span></a>
<?
if ($_SESSION["perfil"] == "Master"){
?>		
        <a class="dock-item" href="principal.php?link=pais"><img src="../img/pais.png" /><span>País</span></a>
        <a class="dock-item" href="principal.php?link=estados"><img src="../img/estados.png" /><span>Estado</span></a>
        <a class="dock-item" href="principal.php?link=municipios"><img src="../img/cidade.png" /><span>Município</span></a>
        <a class="dock-item" href="principal.php?link=planos"><img src="../img/planos.png" /><span>Planos</span></a>
        <a class="dock-item" href="principal.php?link=clientes"><img src="../img/clientes.png" /><span>Clientes</span></a>
        <a class="dock-item" href="principal.php?link=usuario"><img src="../img/user.png" /><span>Usuários</span></a>
<?
}
?>
        <a class="dock-item" href="principal.php?link=grupos"><img src="../img/link.png" /><span>Grupos</span></a>
        <a class="dock-item" href="principal.php?link=grupos_emails"><img src="../img/gruposEmail.png" /><span>Grupos E-mails</span></a>
        <a class="dock-item" href="principal.php?link=emailsNews"><img src="../img/email.png" /><span>E-mails</span></a>
        <a class="dock-item" href="principal.php?link=agendar_emails"><img src="../img/date.png" /><span>Agendar E-mails</span></a>
        <a class="dock-item" href="principal.php?link=layout"><img src="../img/document.png" /><span>Montar Layout</span></a>
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