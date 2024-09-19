package ar.edu.utn.frba.dds.ejercicio_02.personajes;

import ar.edu.utn.frba.dds.ejercicio_02.Persistente;
import ar.edu.utn.frba.dds.ejercicio_02.converters.ElementoDefensorAttributeConverter;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_personaje")
public abstract class Personaje extends Persistente {

  @Getter
  @ElementCollection
  @CollectionTable(name = "elemento_defensor")
  @Convert(converter = ElementoDefensorAttributeConverter.class)
  @Column(name = "elemento")
  private List<ElementoDefensor> elementos;

  @Getter @Setter
  @Column(name = "estamina")
  private Integer estamina;

  @Getter @Setter
  @Column(name = "puntos_de_vida")
  private Integer puntosDeVida;

  public Personaje(){
    this.elementos = new ArrayList<>();
  }

  public void atacar(Personaje personaje) {
  //todo
  }

  public void agregarElemento(ElementoDefensor elemento){
    this.elementos.add(elemento);
  }

}
