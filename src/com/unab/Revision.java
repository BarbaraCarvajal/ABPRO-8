package com.unab;

public class Revision {

  String idRevision, nombre, detalle, estado;

  public Revision() {
  }

  

  public Revision(String idRevision, String nombre, String detalle, String estado) {
    this.idRevision = idRevision;
    this.nombre = nombre;
    this.detalle = detalle;
    this.estado = estado;
  }
  
  @Override
  public String toString() {
    return "Revision \nidRevision = " + idRevision + ", nombre= " + nombre + ", detalle= " + detalle + ", estado= " + getEstadoRevision()
        + "]";
  }

  public String getEstadoRevision(){
    String esRevision = "none";
    if (this.estado.equals("1")){
      esRevision = "Estado sin problemas";
    }else if (estado.equals("2")){
      esRevision = "Estado con observaciones";
    }else if (this.estado.equals("3")){
      esRevision = "No aprueba";
    }else{
      esRevision = "No informado";
    }
    return esRevision;
  }


  public String getIdRevision() {
    return idRevision;
  }

  public void setIdRevision(String idRevision) {
    this.idRevision = idRevision;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getDetalle() {
    return detalle;
  }

  public void setDetalle(String detalle) {
    this.detalle = detalle;
  }

  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  
  









  
}
