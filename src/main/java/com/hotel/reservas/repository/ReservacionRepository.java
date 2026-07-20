package com.hotel.reservas.repository;

import com.hotel.reservas.entity.Reservacion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservacionRepository extends CrudRepository<Reservacion, Integer> {
}
