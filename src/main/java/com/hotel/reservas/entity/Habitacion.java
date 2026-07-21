package com.hotel.reservas.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "habitaciones")
public class Habitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_habitacion")
    private Integer idHabitacion;

    @Column(name = "numero", nullable = false, unique = true)
    private Integer numero;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo; // Sencilla, Doble, Suite, etc.

    @Column(name = "precio_por_noche", nullable = false)
    private Double precioPorNoche;

    @Column(name = "disponible", nullable = false)
    private Boolean disponible = true;


    @OneToMany(mappedBy = "habitacion", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Reservacion> reservaciones = new ArrayList<>();

    // ===== Constructores =====
    public Habitacion() {
    }

    public Habitacion(Integer numero, String tipo, Double precioPorNoche, Boolean disponible) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = disponible;
    }

    // ===== Metodo
    public void agregarReservacion(Reservacion reservacion) {
        reservaciones.add(reservacion);
        reservacion.setHabitacion(this);
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

    public List<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(List<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }
}
