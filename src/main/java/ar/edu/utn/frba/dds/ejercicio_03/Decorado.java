package ar.edu.utn.frba.dds.ejercicio_03;


public abstract class Decorado {

  protected Producto producto;

  public Double precio() {
    return this.producto.precio();
  }


}
