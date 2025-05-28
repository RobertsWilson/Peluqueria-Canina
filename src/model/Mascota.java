package model;

public class Mascota {
  private static int cantidadMascotas=1;
  private int id;
  private String nombre;
  private Especie especie;
  private String raza;
  private int edad;
  private String nombre_dueño;



  public Mascota(String nombre, Especie especie, String raza, int edad, String nombre_dueño) {
    this.id = cantidadMascotas++;
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.nombre_dueño = nombre_dueño;
  }

  //Funcion Busqueda de mascota en el array
  public static Mascota buscarMascotas(Mascota[] mascotas, String nombre) {
    for (Mascota mascota : mascotas) {
      if (mascota.getNombre().equalsIgnoreCase(nombre)) {

        return mascota;
      }
    }
    return null;
  }

  //Funcion Contador de especies
  public static int contarEspecies(Mascota[] mascotas, Especie especie){
    int contador=0;
    for (Mascota mascota : mascotas){
      if (mascota.getEspecie()== especie)
        contador++;
    }
    return contador;
  }


  public int getId() {
    return id;
  }

  public Especie getEspecie() {
    return especie;
  }

  public void setEspecie(Especie especie) {
    this.especie = especie;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getNombre_dueño() {
    return nombre_dueño;
  }

  public void setNombre_dueño(String nombre_dueño) {
    this.nombre_dueño = nombre_dueño;
  }


  public void MostrarDatos() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {
    return "Mascota{" +
            "id=" + id +
            ", nombre='" + nombre + '\'' +
            ", especie='" + especie + '\'' +
            ", raza='" + raza + '\'' +
            ", edad=" + edad +
            ", nombre_dueño='" + nombre_dueño + '\'' +
            '}';
  }
}
