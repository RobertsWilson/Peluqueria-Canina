import model.*;

import java.time.LocalDateTime;

public class Main {
  public static void main(String[] args) {

    Mascota mascota1 = new Mascota("Bobi", Especie.PERRO, "Golden Retriver", 5, "Gerundio"  );
    Servicio servicio1= new Servicio(TipoServicio.CORTE,"Corte de cabello completo", 30, 8000  );
    Turno turno1=new Turno(LocalDateTime.of(2025, 5, 22, 19, 30), EstadoTurno.PROGRAMADO, mascota1, servicio1);

    mascota1.MostrarDatos();
    servicio1.MostrarDatos();
    turno1.MostrarDatos();

    Mascota mascota2 = new Mascota("Luna", Especie.PERRO, "Caniche", 3, "María López");
    Servicio servicio2 = new Servicio(TipoServicio.CORTE, "Corte estético con tijera", 25, 7500);
    Turno turno2 = new Turno(LocalDateTime.of(2025, 5, 23, 10, 15), EstadoTurno.PROGRAMADO, mascota2, servicio2);

    mascota2.MostrarDatos();
    servicio2.MostrarDatos();
    turno2.MostrarDatos();




  }
}