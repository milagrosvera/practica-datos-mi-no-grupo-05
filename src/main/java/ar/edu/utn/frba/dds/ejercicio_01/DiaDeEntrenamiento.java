package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DiaDeEntrenamiento {

  private List<Ejercicio> ejercicios;
  private Integer numero; // representa el orden en la duracion de la rutina.
  private DiaDeEntrenamiento siguienteDia;


  public void agregarEjercicio(Ejercicio ejercicio) {
    ejercicios.add(ejercicio);
  }
}
