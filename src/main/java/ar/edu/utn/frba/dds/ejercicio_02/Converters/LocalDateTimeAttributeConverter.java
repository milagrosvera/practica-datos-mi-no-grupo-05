package ar.edu.utn.frba.dds.ejercicio_02.Converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.time.LocalDateTime;
import java.util.Date;

@Converter(autoApply = true)
public class LocalDateTimeAttributeConverter implements AttributeConverter<LocalDateTime, Date> {


    @Override
    public Date convertToDatabaseColumn(LocalDateTime locDateTime) {
        return locDateTime == null ? null : Date.from(locDateTime.atZone(java.time.ZoneId.systemDefault()).toInstant());
    }

    @Override
    public LocalDateTime convertToEntityAttribute(Date sqlDate) {
        //TODO fix this
        //return sqlDate == null ? null : sqlDate.toLocalDate().atStartOfDay();
        return null;
    }
}
