package org.olmedo.appCompania;

import org.olmedo.appCompania.personalcompania.Gerente;

public class Compania {
    public static void main(String[] args) {

      Gerente gerente = new Gerente(55577.00, 3000.00, 2, "David", "Rawson", "16.666.232-2","PresidenIlias 88");
      gerente.aumentarRemuneracion(20);
      gerente.setPresupuesto(44433.00);
      System.out.println(gerente);

    }
}
