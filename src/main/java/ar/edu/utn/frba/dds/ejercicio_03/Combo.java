package ar.edu.utn.frba.dds.ejercicio_03;

import java.util.ArrayList;
import java.util.List;

public class Combo {
  private List<Producto> productos;

  public Double precio(){
    return this.productos.stream().mapToDouble(p-> p.precio()).sum();
  }


  public Combo(){
      this.productos = new ArrayList<Producto>();
  }
}
