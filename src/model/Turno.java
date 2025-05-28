package model;

import java.time.LocalDate;
import java.time.LocalDateTime;


public class Turno {

    private static int contadorId = 1;
    private int id;
    private LocalDateTime  fechayhora;
    private EstadoTurno EstadoTurno;
    private Mascota mascota;
    private Servicio servicio;
    public static final int MAX_TURNOS_DIARIOS = 5;


    public Turno(LocalDateTime fechayhora, EstadoTurno estadoTurno, Mascota mascota, Servicio servicio) {
        this.id = contadorId++;
        this.fechayhora = fechayhora;
        EstadoTurno = estadoTurno;
        this.mascota = mascota;
        this.servicio = servicio;
    }

    public boolean esTurnoActivo() {
        return this.getEstadoTurno() == EstadoTurno.PROGRAMADO;
    }

    public static final boolean puedeAgregarOtroTurno(Turno[] turnos, LocalDate fechayhora){
        int contadorturnos = 0;
        for (Turno turno : turnos){
            if (turno!=null && turno.getFechayhora().toLocalDate().equals(fechayhora)){
            contadorturnos++;
            }
        }
        return contadorturnos<MAX_TURNOS_DIARIOS;
    }

    public int getId() {
        return id;
    }

    public EstadoTurno getEstadoTurno() {
        return EstadoTurno;
    }

    public void setEstadoTurno(EstadoTurno estadoTurno) {
        EstadoTurno = estadoTurno;
    }

    public LocalDateTime getFechayhora() {
        return fechayhora;
    }

    public void setFechayhora(LocalDateTime fechayhora) {
        this.fechayhora = fechayhora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public void MostrarDatos(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Turno{" +
                "id=" + id +
                ", fechayhora=" + fechayhora +
                ", EstadoTurno='" + EstadoTurno + '\'' +
                ", mascota=" + mascota +
                ", servicio=" + servicio +
                '}';
    }
}
