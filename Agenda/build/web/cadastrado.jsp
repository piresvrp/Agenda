<%-- 
    Document   : cadastrado
    Created on : 26/06/2015, 20:51:38
    Author     : Maicon Vinicios
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" href="css/cadastrado.css">
    </head>
    
    <body>
        
        <header>
            <h1><em>A-comp: Agenda de compromissos</em></h1>
        </header>
        
        <div id="mensagem">
            <p>Usuário cadastrado com sucesso. Acesse agora sua agenda!</p>
        </div>
        
        <div class="esquerdo">  
            <form method="post">
                <input type="text" name="login" placeholder="E-mail" required="required"><br>
                <input type="password" name="Senha" placeholder="Senha" required="required"><br><br>
                <button type="submit">Acessar</button>
            </form>
        </div> 
        
        <section class="direito">
            <h2>A-comp sua agenda Web</h2>
        </section>  
        
        <footer>
            <p>Desenvolvido por Maicon Vinicios, Tarsis Cotrim e Vinicius Resende.</p>
        </footer>
        
    </body>
</html>
