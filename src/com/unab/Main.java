
package com.unab;

/**
 * Clase principal donde se ejecuta el programa
 * @author Luis Zenteno, Barbara Carvajal, Maria Fernanda
 *@version 1.2


 Finalmente, cree una clase con un método main(). En ella se debe crear una instancia 
 de la clase Listado, y cinco instancias de diferentes tipos de usuarios. 
 Se deben agregar las instancias al listado de la clase guía, y llamar al método que despliega los datos.
 */
public class Main {

	
	// Instancia de 5 usuarios diferentes

	static Cliente cliente1 = new Cliente("Barbara camila", "carvajal saez", "13-08-1993",  "11.111.111", "934345566", "ProVida", "2", "Calle 123", "Quilpue", "29");
	static Profesional profesional1 = new Profesional("Maria Fernanda", "13-02-1990", "18.222.222", "FrontEnd Developer", "01-01-2022");
	static Administrativo admin1 = new Administrativo("Luis", "04-02-2000", "20.222.333", "Ventas", "4");
	static Profesional profesional2 = new Profesional("Susana", "12-03-1990", "18.555.222", "Ingeniera Informatica", "01-01-2015");
	static Usuario user1 = new Usuario("Oscar", "12-10-1990", "17.299.333");


	public static void main(String[] args) {
	
		// creamos la lista 
		Listado listaPrueba = new Listado();
		
		// agregamos los usuarios anteriormente creados a la lista
		
		listaPrueba.agregarUsuario(user1);
		listaPrueba.agregarUsuario(profesional1);
		listaPrueba.agregarUsuario(admin1);
		listaPrueba.agregarUsuario(profesional2);
		listaPrueba.agregarUsuario(cliente1);
		// llamar a la funcion de analizar usuario
		listaPrueba.analizarUsuario();
	}
}