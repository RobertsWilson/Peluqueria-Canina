package model;

public class Servicio {
  private static int cantidadServicios = 1;
  private int id;
  private TipoServicio tipoServicio;
  private String descripcion;
  private double duracion;
  private int precio;


  public Servicio(TipoServicio tipoServicio, String descripcion, double duracion, int precio) {
    this.id = cantidadServicios++;
    this.tipoServicio = tipoServicio;
    this.descripcion = descripcion;
    this.duracion = duracion;
    this.precio = precio;
  }

  //Precio con IVA
  public static double precioConIVA(int precio) {
    double iva = 1.21;
    return precio * iva;
  }

  //Metodo para determinar si un servicio dura mas de 60 minutos
  public boolean servicioLargo(){
    return this.duracion>60;
  }


  public int getId() {
    return id;
  }

  public TipoServicio getTipoServicio() {
    return tipoServicio;
  }

  public void setTipoServicio(TipoServicio tipoServicio) {
    this.tipoServicio = tipoServicio;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getDuracion() {
    return duracion;
  }

  public void setDuracion(double duracion) {
    this.duracion = duracion;
  }

  public int getPrecio() {
    return precio;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public void MostrarDatos() {
    System.out.println(this.toString());
  }

  @Override
  public String toString() {
    Servicio.precioConIVA(precio);
    return "Servicio{" +
        "id=" + id +
        ", tipoServicio=" + this.tipoServicio +
        ", descripcion='" + this.descripcion + '\'' +
        ", duracion=" + this.duracion +
        ", precio=" + this.precio +
        ", Precio con IVA= " + precioConIVA(precio) +
        '}';
  }

  @Override
  public boolean equals(Object otroObj){
    if(otroObj==null) return false;
    //convertir a tipo servicio
    Servicio servicio= (Servicio) otroObj;

    //COMPARO PARA VER SI TODOS LO ATRIBUTOS SON IGUALES
    if (this.descripcion.equals(servicio.getDescripcion()) &&
        this.duracion== servicio.getDuracion() &&
        this.precio==servicio.getPrecio() &&
        this.getTipoServicio().equals(servicio.getTipoServicio()))

    return true;
    else
      return false;
  }

}




