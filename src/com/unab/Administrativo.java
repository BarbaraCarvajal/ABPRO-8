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
      
      System.out.println("\n-------------------------------");
      System.out.println("Analisis de datos del administrativo\n");
      System.out.println("El nombre del administrativo es: "+ getNombre());
      System.out.println("La fecha de nacimiento de "+getNombre()+" es: "+getFechaNac());
      System.out.println("El rut de "+getNombre()+ " es: "+getRut());
      System.out.println("El area donde trabaja "+getNombre()+" es: "+getArea());
      System.out.println("Años de experiencia previa de "+getNombre()+" es: "+getExperienciaPrevia());
      
    }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getExperienciaPrevia() {
    return experienciaPrevia;
  }

  public void setExperienciaPrevia(String experienciaPrevia) {
    this.experienciaPrevia = experienciaPrevia;
  }

    

}
