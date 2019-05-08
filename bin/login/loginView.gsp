<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
     <meta name="layout" content="nuestro_main" />
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sample title</title>
    </head>
    <body>
        <h1>Sample line</h1>
        <g:form action="ingresar">
            <h1>Login</h1><br>
            <label>Correo electrónico: </label> <input type="text" placeholder="ejemplo@unisabana.edu.co" name="emailPersona"></input><br>
            <label>Contraseña: </label> <input type="text" name="passwordPersona"></input><br>
            <input type="submit" value="Ingresar">
        </g:form>
        
    </body>
</html>