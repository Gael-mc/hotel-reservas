package com.hotel.reservas.mapper;

import com.hotel.reservas.domain.Room;
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

    Room toDomain(Habitacion entity);

    Habitacion toEntity(Room domain);

    @Mapping(target = "reservaciones", ignore = true)
    void actualizarEntity(Room domain, @MappingTarget Habitacion entity);
}
