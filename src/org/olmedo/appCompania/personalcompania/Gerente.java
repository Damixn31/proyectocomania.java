package org.olmedo.appCompania.personalcompania;

public class Gerente extends Empleado{
  // Atributo
  private double presupuesto;

  // Constructor
  public Gerente(double presupuesto, double remuneracion, int empleadoId, String nombre, String apellido, String numeroFiscal, String direccion){
    super(remuneracion, empleadoId, nombre, apellido, numeroFiscal, direccion);
    this.presupuesto = presupuesto;
  }

  //Getter
  public double getPresupuesto(){
    return presupuesto;
  }
  public void setPresupuesto(double presupuesto){
    this.presupuesto = presupuesto;
  }

  @Override
  public String toString(){
    return "Presupuesto = " + presupuesto
      + ", " + super.toString();
  }
}
