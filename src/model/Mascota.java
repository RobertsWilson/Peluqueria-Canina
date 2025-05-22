package model;

public class Mascota {
  private int id;
  private String nombre;
  private String especie;
  private String raza;
  private int edad;
  private String nombre_dueño;
  public static int cantidadMascotas;


  public Mascota() {
    cantidadMascotas++;
    this.id=cantidadMascotas;

  }

  public Mascota(int id, String nombre, String especie, String raza, int edad, String nombre_dueño) {
    cantidadMascotas++;
    this.id = id;
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.nombre_dueño = nombre_dueño;
  }



  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getEspecie() {
    return especie;
  }

  public void setEspecie(String especie) {
    this.especie = especie;
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
  public void Mostrarinfo() {
    System.out.println(toString());
  }
}
