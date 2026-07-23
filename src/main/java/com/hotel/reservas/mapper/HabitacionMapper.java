package com.hotel.reservas.mapper;

import com.hotel.reservas.entity.Habitacion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapeador entre la entidad Habitacion (JPA) y el modelo de dominio Habitacion.
 * Reutiliza ReservacionMapper para traducir la lista de reservaciones asociadas.
 */
@Mapper(componentModel = "spring", uses = ReservacionMapper.class)
public interface HabitacionMapper {

    com.hotel.reservas.domain.Habitacion toDomain(Habitacion entity);

    Habitacion toEntity(com.hotel.reservas.domain.Habitacion domain);

    @Mapping(target = "reservaciones", ignore = true)
    void actualizarEntity(com.hotel.reservas.domain.Habitacion domain, @MappingTarget Habitacion entity);
}
