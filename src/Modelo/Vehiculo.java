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
public class Vehiculo {

    private String placa;
    private int hEntrada, hSalida;
    private String TipoVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, int hEntrada, int hSalida, String TipoVehiculo) {
        this.placa = placa;
        this.hEntrada = hEntrada;
        this.hSalida = hSalida;
        this.TipoVehiculo = TipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int gethEntrada() {
        return hEntrada;
    }

    public void sethEntrada(int hEntrada) {
        this.hEntrada = hEntrada;
    }

    public int gethSalida() {
        return hSalida;
    }

    public void sethSalida(int hSalida) {
        this.hSalida = hSalida;
    }

    public String getTipoVehiculo() {
        return TipoVehiculo;
    }

    public void setTipoVehiculo(String TipoVehiculo) {
        this.TipoVehiculo = TipoVehiculo;
    }
}
