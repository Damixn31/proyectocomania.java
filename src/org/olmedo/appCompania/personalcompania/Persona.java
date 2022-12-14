package org.olmedo.appCompania.personalcompania;

public class Persona {
  // Atributos
  private String nombre;
  private String apellido;
  private String numeroFiscal;
  private String direccion;

  // Constructor
  public Persona(String nombre, String apellido, String numeroFiscal, String direccion){
    this.nombre = nombre;
    this.apellido = apellido;
    this.numeroFiscal = numeroFiscal;
    this.direccion = direccion;
  }

  // Getter
  public String getNombre(){
    return nombre;
  }
  public String getApellido(){
    return apellido;
  }
  public String getNumeroFiscal(){
    return numeroFiscal;
  }
  public String getDireccion(){
    return direccion;
  }

  @Override
  public String toString(){
    return "\nNombre = " + nombre
      + "\nApellido = " +  apellido
      + "\nNumeroFiscal = " + numeroFiscal
      + "\nDireccion = " + direccion;
  }
}
