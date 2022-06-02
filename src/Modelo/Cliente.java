/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author mono-
 */
public class Cliente extends Persona {

    private Persona[] Datos = new Persona[5];

    public boolean parquearCarro(Persona datos) {
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] == null) {
                Datos[i] = datos;
                return true;
            }
        }
        return false;
    }

    public boolean sacarCarro(String placa) {
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] != null) {
                if (Datos[i].getPlaca().equals(placa)) {
                    Datos[i] = null;
                    return true;
                }
            }
        }
        return false;
    }

    public Persona buscarCarro(String placa) {
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] != null) {
                if (Datos[i].getPlaca().equals(placa)) {
                    return Datos[i];
                }
            }
        }
        return null;
    }

    public static int VHora(String hora) {
        try {
            int numConvertido = Integer.parseInt(hora);
            return numConvertido;
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public String precio(String salida, String placa) {
        String precio = null;
        for (int i = 0; i < Datos.length; i++) {
            if (Datos[i] != null) {
                if (Datos[i].getPlaca().equals(placa)) {
                    precio = "" + (Integer.parseInt(salida) - Datos[i].gethEntrada()) * 1000;
                } else {
                    precio = null;
                }
            }
        }
        return precio;
    }
}
