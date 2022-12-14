package org.olmedo.appCompania.personalcompania;

public class Cliente extends Persona {
  // Atributo
  private int clienteId;

  // Constructor
  public Cliente(int clienteId, String nombre, String apellido, String numeroFiscal, String direccion){
    super(nombre, apellido, numeroFiscal, direccion);
    this.clienteId = clienteId;
  }
  
  // Getter
  public int getClienteId(){
    return clienteId;
  }

  @Override
  public String toString(){
    return "clienteId= " + clienteId 
     + ", " + super.toString();
  }


}
