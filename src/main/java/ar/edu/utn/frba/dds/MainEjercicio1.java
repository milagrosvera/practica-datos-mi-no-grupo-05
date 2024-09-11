package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.ejercicio_01.Ejercicio;
import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;



public class MainEjercicio1  {


    public static void main(String[] args) {

        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        repositorio.guardar(ejercicio);
    }
}
