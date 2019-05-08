package lux

class BootStrap {

    def init = 
    {  servletContext ->
        new lux.Usuario(nombre:"Santiago",apellido:"Rivadeneira Delgado",sexo:"Hombre", email1: "santiagoride@unisabana.edu.co", contrasena: "nadadenada", nacimiento: new Date(2001-01-19)).save(failOnError:true);
        new lux.Usuario(nombre:"Juan David", apellido:"Valencia", sexo:"Hombre", email1: "juanvalag@unisabana.edu.co", contrasena: "nadadenada", nacimiento: new Date(2001-01-19)).save(failOnError:true);
    }
    def destroy = {
    }
}
