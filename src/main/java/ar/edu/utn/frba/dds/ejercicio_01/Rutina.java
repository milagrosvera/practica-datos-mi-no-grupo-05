package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Rutina {

    private Deportista deportista;
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;
    private Rutina rutinaAnterior;

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
