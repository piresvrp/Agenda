<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Agenda de compromissos</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/estilo.css">
        <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.3.1/jquery.min.js"></script>
        <!-- Script que abre a janela modal contendo informações dos livros -->
	<script type="text/javascript">
		$(document).ready(function(){
			$("a[rel=modal]").click( function(ev){
			ev.preventDefault();
 
			var id = $(this).attr("href");
 
			var alturaTela = $(document).height();
			var larguraTela = $(window).width();
     
			//colocando o fundo preto
			$('#mascara').css({'width':larguraTela,'height':alturaTela});
			$('#mascara').fadeIn(1000); 
			$('#mascara').fadeTo("slow",0.8);
 
			var left = ($(window).width() /2) - ( $(id).width() / 2 );
			var top = ($(window).height() / 2) - ( $(id).height() / 2 );
     
			$(id).css({'top':top,'left':left});
			$(id).show();   
		});
 
		$("#mascara").click( function(){
			$(this).hide();
			$(".janela").hide();
		});
 
		$('.fechar').click(function(ev){
			ev.preventDefault();
			$("#mascara").hide();
			$(".janela").hide();
		});
	});
	</script>
    </head>
    
    <body>
        
        <header>
            <h1><em>A-comp: Agenda de compromissos</em></h1>
            <p><a href="#logar" rel="modal">Entrar</a></p>
        </header>
        
        <div id="logar" class="janela"> 
            <a href="#" class="fechar">X</a><br />
            <form method="post">
                <input type="text" name="login" placeholder="E-mail" required="required"><br>
                <input type="password" name="Senha" placeholder="Senha" required="required"><br><br>
                <button type="submit">Acessar</button>
            </form>
        </div> 
        
        <section class="esquerdo"> 
        <h2>Formulário de cadastro</h2>
        <form method="post" action="${pageContext.request.contextPath}/Cadastrar">
            <input type="text" name="nome" placeholder="Nome" required="required" autocomplete="off"><br>                    
            <input type="email" name="email" placeholder="E-mail" required="required" autocomplete="off"><br>
            <input type="password" name="senha" placeholder="Senha" required="required"><br>
            <input type="password" name="rsenha" placeholder="Confirmação de senha" required="required"><br>
            <button type="submit">Cadastrar</button>
        </form>
    </section>
        
        <section class="direito">
            <h2>A-comp sua agenda Web</h2>
        </section>  
        
        <footer>
            <p>Desenvolvido por Maicon Vinicios, Tarsis Cotrim e Vinicius Resende.</p>
        </footer>
        
    </body>
</html>
