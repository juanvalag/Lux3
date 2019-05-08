package lux



class LoginController {

    def index() { }
	
	def loginView() {
		
	}
	
	def ingresar() {
		def correo= params.emailPersona
		def password= params.passwordPersona
		def allUsuarios = Usuario.list();
		
		def saludo=""
	//	render(view:"ingresar",model:[viewsaludo: saludo])
	for (usuario in allUsuarios)
		 {
			
	if((correo == usuario.email1) && (password == usuario.contrasena)) 
			{
				saludo = "Felicidades, ingresaste Crack"
				render(view:"ingresar",model:[viewsaludo: saludo])
				
			}
			else
			{
				saludo="Contraseña o usuarios incorrecta por favor verifica"	
				render(view:"ingresar",model:[viewsaludo: saludo])
			}
		}
		render(view:"ingresar",model:[viewsaludo: saludo])
			
		}
		
	}

