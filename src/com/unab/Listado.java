package com.unab;

import java.util.ArrayList;

public class Listado implements Asesoria{
  /* 
  Cree la clase Listado, la que debe tener declarada una lista 
  objetos de la clase Usuario,representada a través de la interface Asesoria.
- En la clase Listado debe tener dos métodos: uno para agregar un elemento al
 listado, y otro que permita llamar al método analizarUsuario() 
 de todas las instancias registradas en el listado.
*/

  @Override
     public void analizarUsuario() {
  }

    ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public void agregarUsuario(Asesoria usuario) {
      listaUsuarios.add(usuario);
    }
  
    public void analizarTodosLosUsuarios() {
      for (Asesoria usuario : listaUsuarios) {
        usuario.analizarUsuario();


      
}
    }
  }