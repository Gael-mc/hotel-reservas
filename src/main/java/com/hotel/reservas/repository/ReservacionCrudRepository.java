package com.hotel.reservas.repository;

import com.hotel.reservas.entity.Reservacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionCrudRepository extends CrudRepository<Reservacion, Integer> {
}
