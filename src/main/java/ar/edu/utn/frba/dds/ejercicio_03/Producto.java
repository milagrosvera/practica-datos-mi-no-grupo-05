package ar.edu.utn.frba.dds.ejercicio_03;

public abstract class Producto {

  private String nombre;

  private Marca marca;

  public Producto() {

  }

  public Double precio() {

      return 0.0;
  }

  public Integer stock() {

      return 0;
  }
}
