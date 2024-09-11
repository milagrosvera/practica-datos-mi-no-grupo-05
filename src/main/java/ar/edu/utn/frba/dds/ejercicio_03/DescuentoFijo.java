package ar.edu.utn.frba.dds.ejercicio_03;

public class DescuentoFijo extends Decorado {
  private Double valor;

  public Double precio() {
    return this.producto.precio() - this.valor;
  }

  public DescuentoFijo() {

  }
}
