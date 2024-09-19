package ar.edu.utn.frba.dds.ejercicio_02.converters;

import ar.edu.utn.frba.dds.ejercicio_02.elementos.Arco;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.ElementoDefensor;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Escudo;
import ar.edu.utn.frba.dds.ejercicio_02.elementos.Espada;

import javax.persistence.AttributeConverter;
import javax.persistence.Convert;
import javax.persistence.Converter;

@Converter
public class ElementoDefensorAttributeConverter implements AttributeConverter<ElementoDefensor, String> {

    @Override
    public String convertToDatabaseColumn(ElementoDefensor elementoDefensor) {
        if (elementoDefensor == null) {
            return null;
        }

        String nombre = "";

        if(elementoDefensor instanceof Arco){
            nombre = "Arco";
        }
        else if(elementoDefensor instanceof Escudo){
            nombre = "Escudo";
        }
        else if (elementoDefensor instanceof Espada){
            nombre = "Espada";
        }

        return nombre;
    }

    @Override
    public ElementoDefensor convertToEntityAttribute(String s) {
        if (s == null) {
            return null;
        }

        ElementoDefensor elementoDefensor = null;

        switch(s){
            case "Arco": elementoDefensor = new Arco(); break;
            case "Escudo": elementoDefensor = new Escudo(); break;
            case "Espada": elementoDefensor = new Espada(); break;
        }

        return elementoDefensor;
    }
}
