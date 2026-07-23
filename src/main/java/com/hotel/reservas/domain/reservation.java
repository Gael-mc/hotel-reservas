package com.hotel.reservas.domain;

import java.time.LocalDate;

/**
 * Modelo de dominio de Reservacion.
 * POJO puro, sin anotaciones de JPA, desacoplado de la capa de persistencia.
 *
 * En lugar de referenciar el objeto Habitacion completo (lo cual generaria un
 * ciclo entidad<->dominio innecesario), el dominio conserva unicamente el
 * identificador de la habitacion asociada (idHabitacion).
 */
public class reservation {

    private Integer idReservacion;
    private String nombreCliente;
    private LocalDate fechaEntrada;
    private LocalDate fechaSalida;
    private Double total;
    private String estado;
    private Integer idHabitacion;

    // ===== Constructores =====
    public reservation() {
    }

    public reservation(Integer idReservacion, String nombreCliente, LocalDate fechaEntrada,
                       LocalDate fechaSalida, Double total, String estado, Integer idHabitacion) {
        this.idReservacion = idReservacion;
        this.nombreCliente = nombreCliente;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.total = total;
        this.estado = estado;
        this.idHabitacion = idHabitacion;
    }

    // ===== Getters y Setters =====
    public Integer getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(Integer idReservacion) {
        this.idReservacion = idReservacion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Integer idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
}
