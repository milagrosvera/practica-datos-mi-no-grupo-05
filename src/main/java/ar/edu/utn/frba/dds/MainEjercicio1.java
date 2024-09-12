package ar.edu.utn.frba.dds;

public class MainEjercicio1  {
    
    public static void main(String[] args) {

        Ejercicio1 ejercicio = new Ejercicio1();
        ejercicio.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        repositorio.guardar(ejercicio);
    }
}
