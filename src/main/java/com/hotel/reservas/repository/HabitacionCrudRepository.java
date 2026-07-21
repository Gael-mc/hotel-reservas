package com.hotel.reservas.repository;

import com.hotel.reservas.entity.Habitacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabitacionCrudRepository extends CrudRepository<Habitacion, Integer> {
}
