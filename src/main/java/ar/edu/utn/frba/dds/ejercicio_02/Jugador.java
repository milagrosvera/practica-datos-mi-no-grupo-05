package ar.edu.utn.frba.dds.ejercicio_02;

import ar.edu.utn.frba.dds.ejercicio_02.converters.LocalDateTimeAttributeConverter;
import ar.edu.utn.frba.dds.ejercicio_02.personajes.Personaje;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity @Table(name = "jugador")
@Getter
@Setter
public class Jugador extends Persistente{
  @Column(name="nombre")
  private String nombre;

  @Column(name = "apellido")
  private String apellido;

  @Convert(converter = LocalDateTimeAttributeConverter.class)
  @Column(name = "fecha_alta", columnDefinition = "DATE")
  private LocalDate fechaAlta;

  @OneToOne
  @JoinColumn(name = "personaje_id", referencedColumnName = "id")
  private Personaje personaje;

  public Jugador() {
    this.fechaAlta = LocalDate.now();
  }

  public void cambiarPersonaje(Personaje personaje) {
    this.personaje = personaje;
  }
}
