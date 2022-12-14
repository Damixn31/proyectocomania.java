package org.olmedo.appCompania.personalcompania;

public class Empleado extends Persona {
  // Atributos
  private double remuneracion;
  private int empleadoId;

  //Construcor
  public Empleado(double remuneracion, int empleadoId, String nombre, String apellido, String numerofiscal, String direccion){
    super(nombre, apellido, numerofiscal, direccion);
    this.remuneracion = remuneracion;
    this.empleadoId = empleadoId;
  }

  // Getter
  public double getRemuneracion(){
    return remuneracion;
  }
  public int getEmpleadoId(){
    return empleadoId;
  }

  // Setter
  public void aumentarRemuneracion(int porcentaje){
    this.remuneracion += remuneracion * porcentaje /100;
  }

  @Override
  public String toString(){
    return "\nEmpleadoId = " + empleadoId
      + "\nRemuneracion = " + remuneracion + super.toString();

  }
}
