package ar.edu.utn.frba.dds.ejercicio_02.elementos;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "escudo")
public class Escudo extends Persistente implements ElementoDefensor{

  @Override
  public void defenderA(Personaje personaje) {

  }
}