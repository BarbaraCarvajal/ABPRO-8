package com.unab;

import java.util.ArrayList;

public class Listado implements Asesoria {
  /*
   * Cree la clase Listado, la que debe tener declarada una lista
   * objetos de la clase Usuario,representada a través de la interface Asesoria.
   * - En la clase Listado debe tener dos métodos: uno para agregar un elemento al
   * listado, y otro que permita llamar al método analizarUsuario()
   * de todas las instancias registradas en el listado.
   */

  ArrayList<Usuario> listaUsuarios = new ArrayList<>();

  // metodo que agrega usuarios a la lista
  public void agregarUsuario(Usuario usuario) {
    listaUsuarios.add(usuario);
  }

  // metodo que usa el aanalizar a los usuarios
  @Override
  public void analizarUsuario() {
    for (Asesoria usuario : listaUsuarios) {
      usuario.analizarUsuario();
    }
  }
}