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
        System.out.println("\n-------------------------------");
        System.out.println("Analisis de datos del profesional \n");
				System.out.println("El nombre del profesional es: "+ getNombre());
        System.out.println("Fecha de nacimiento de "+getNombre()+" es: "+getFechaNac());
        System.out.println("Rut de "+getNombre()+" es: "+getRut());
        System.out.println("Titulo de "+getNombre()+" es: "+getTitulo());
        System.out.println("La fecha de ingreso de "+getNombre()+" es: "+getFechaIngreso());
       

      }

public String getTitulo() {
  return titulo;
}

public void setTitulo(String titulo) {
  this.titulo = titulo;
}

public String getFechaIngreso() {
  return fechaIngreso;
}

public void setFechaIngreso(String fechaIngreso) {
  this.fechaIngreso = fechaIngreso;
}



  
}
