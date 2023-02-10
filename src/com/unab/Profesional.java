package com.unab;

public class Profesional extends Usuario{

  String titulo, fechaIngreso;

  public Profesional(String nombre, String fechaNac,String rut, String titulo, String fechaIngreso) {
    super(nombre, fechaNac, rut);
    this.titulo = titulo;
    this.fechaIngreso = fechaIngreso;
  }


// En las clases hijas, el método analizarUsuario() debe desplegar la información del 
// método correspondiente al padre, y los datos expuestos en las clases hijas.

@Override
	public void analizarUsuario() {
		
		//System.out.println("El nombre del usuario es: "+ getNombre());
		System.out.println("El nombre del profesional es: "+ getNombre());
	}

}
