package com.hotel.reservas.mapper;

import com.hotel.reservas.domain.reservation;
import com.hotel.reservas.entity.Reservacion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * Mapeador entre la entidad Reservacion (JPA) y el modelo de dominio Reservacion.
 */
@Mapper(componentModel = "spring")
public interface ReservacionMapper {

    /**
     * La entidad expone el objeto Habitacion completo, mientras que el dominio
     * solo necesita su identificador (idHabitacion), por lo que se requiere un
     * mapeo explicito de la propiedad anidada.
     */
    @Mapping(source = "habitacion.idHabitacion", target = "idHabitacion")
    reservation toDomain(Reservacion entity);

    /**
     * El dominio solo conoce el idHabitacion, no la entidad Habitacion completa.
     * Esa asociacion se resuelve en la capa de servicio (a partir del repositorio),
     * por lo que aqui se ignora explicitamente.
     */
    @Mapping(target = "habitacion", ignore = true)
    Reservacion toEntity(reservation domain);

    /**
     * Actualiza una entidad existente con los datos del dominio sin tocar la
     * relacion con Habitacion (util para operaciones de actualizacion parcial).
     */
    @Mapping(target = "habitacion", ignore = true)
    void actualizarEntity(reservation domain, @MappingTarget Reservacion entity);
}
