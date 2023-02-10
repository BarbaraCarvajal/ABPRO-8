package com.unab;

public class Administrativo extends Usuario{
  String area, experienciaPrevia;

  public Administrativo(String nombre, String fechaNac,String rut, String area, String experienciaPrevia) {
    super(nombre, fechaNac, rut);
    this.area = area;
    this.experienciaPrevia = experienciaPrevia;
  }

  // En las clases hijas, el método analizarUsuario() debe desplegar la información del 
  // método correspondiente al padre, y los datos expuestos en las clases hijas.
  
  @Override
    public void analizarUsuario() {
      
      //System.out.println("El nombre del usuario es: "+ getNombre());
      System.out.println("El nombre del administrativo es: "+ getNombre());
    }


}
