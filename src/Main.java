import model.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {


    Mascota[] mascotas = new Mascota[5];

    mascotas[0] = new Mascota("Luna", Especie.PERRO, "Caniche", 4, "Martina");
    mascotas[1] = new Mascota("Toby", Especie.PERRO, "Golden Retriever", 2, "Gerundio");
    mascotas[2] = new Mascota("Aston", Especie.CABALLO, "Caballito", 7, "Arturo");
    mascotas[3] = new Mascota("Milo", Especie.GATO, "Siames", 2, "Maria");
    mascotas[4] = new Mascota("Peri", Especie.LORO, "Guacamayo", 3, "Ariel");

    System.out.println("\n");
    Servicio banio = new Servicio(TipoServicio.BANIO, "Baño básico", 70, 1200);
    Servicio corte = new Servicio(TipoServicio.CORTE_DE_PELO, "Corte de pelo completo", 45, 2000);
    Servicio limpieza = new Servicio(TipoServicio.LIMPIEZA_DE_OIDOS, "Limpieza profunda de oídos", 20, 800);

    System.out.println("\n");
    Turno[] turnos = new Turno[10];
    turnos[0] = new Turno(LocalDateTime.now().plusDays(1), EstadoTurno.PROGRAMADO, mascotas[0], banio);
    turnos[1] = new Turno(LocalDateTime.now().plusDays(1), EstadoTurno.PROGRAMADO, mascotas[1], corte);
    turnos[2] = new Turno(LocalDateTime.now().plusDays(1), EstadoTurno.PROGRAMADO, mascotas[2], limpieza);
    turnos[3] = new Turno(LocalDateTime.now().plusDays(1), EstadoTurno.PROGRAMADO, mascotas[3], corte);
    turnos[4] = new Turno(LocalDateTime.now().plusDays(1), EstadoTurno.PROGRAMADO, mascotas[4], banio);
    turnos[5] = new Turno(LocalDateTime.now().plusDays(2), EstadoTurno.REALIZADO, mascotas[0], limpieza);
    turnos[6] = new Turno(LocalDateTime.now().plusDays(3), EstadoTurno.CANCELADO, mascotas[1], corte);
    turnos[7] = new Turno(LocalDateTime.now().plusDays(3), EstadoTurno.PROGRAMADO, mascotas[2], banio);
    turnos[8] = new Turno(LocalDateTime.now().plusDays(4), EstadoTurno.REALIZADO, mascotas[3], limpieza);
    turnos[9] = new Turno(LocalDateTime.now().plusDays(4), EstadoTurno.PROGRAMADO, mascotas[4], corte);

    for (Turno turno : turnos) {
      turno.MostrarDatos();
      System.out.println();
    }


    System.out.println("\n");
    //Se llama al metodo para BUSCAR MASCOTAS (En este caso buscaras a Milo)
    Mascota buscada = Mascota.buscarMascotas(mascotas, "Milo");
    if (buscada != null) {
      System.out.println("Mascota encontrada:");
      buscada.MostrarDatos();
    } else {
      System.out.println("No se encontró una mascota con ese nombre.");
    }


    System.out.println("\n");
    //Se llama al metodo para CONTAR LAS ESPECIES (en este caso perro)
    int contarEspecies = Mascota.contarEspecies(mascotas, Especie.PERRO);
    System.out.println("Cantidad de perros: " + contarEspecies);

    System.out.println("\n");
    //TURNOS ACTIVOS
    System.out.println("=== Turnos Activos (PROGRAMADOS) ===");
    for (Turno turno : turnos) {
      if (turno.esTurnoActivo()) {
        turno.MostrarDatos();
        System.out.println();
      }
    }

    System.out.println("\n");
    //Servicios largos
    System.out.println("=== Servicios (mas de 60 minutos) ===");
    for (Turno turno : turnos) {
      if (turno.getServicio().servicioLargo()) {
        turno.MostrarDatos();
        System.out.println();
      }
    }

    System.out.println("\n");
    //Revisas el Array Turno[] para saber los turnos Programados, cancelados o realizados
    int programados = 0;
    int cancelados = 0;
    int realizados = 0;

    for (Turno turno : turnos) {
      switch (turno.getEstadoTurno()) {
        case PROGRAMADO:
          programados++;
          break;
        case CANCELADO:
          cancelados++;
          break;
        case REALIZADO:
          realizados++;
          break;
      }
    }
    System.out.println("===TURNOS===");
    System.out.println("Turnos programados: " + programados);
    System.out.println("Turnos cancelados: " + cancelados);
    System.out.println("Turnos realizados: " + realizados);


    System.out.println("\n");
    //Llamas a la función puedeAgregarOtroTurno para comprobar si no excediste el limite de turnos por dia(5)
    LocalDate fechaTurno = LocalDate.now().plusDays(1);

    if (Turno.puedeAgregarOtroTurno(turnos, fechaTurno)){
      // Crear el turno y agregarlo al array
    } else {
      System.out.println("No se pueden agregar más turnos para esta fecha.");
    }




  }
}