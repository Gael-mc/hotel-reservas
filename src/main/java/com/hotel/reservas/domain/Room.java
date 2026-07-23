package com.hotel.reservas.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Modelo de dominio de Habitacion.
 * POJO puro, sin anotaciones de JPA, desacoplado de la capa de persistencia.
 */
public class Room {

    private Integer idHabitacion;
    private Integer numero;
    private String tipo;
    private Double precioPorNoche;
    private Boolean disponible;
    private List<reservation> reservaciones = new ArrayList<>();

    // ===== Constructores =====
    public Room() {
    }

    public Room(Integer idHabitacion, Integer numero, String tipo,
                Double precioPorNoche, Boolean disponible) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    // ===== Getters y Setters =====
    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(Double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public Boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public List<reservation> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<reservation> reservaciones) {
        this.reservaciones = reservaciones;
    }
}
