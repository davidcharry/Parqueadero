/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Vista.FormularioEntrada;
import Vista.FormularioPrincipal;
import Vista.FormularioSalida;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author mono-
 */
public class Control implements ActionListener {

    FormularioPrincipal objPpal;
    FormularioEntrada objEntrada;
    Cliente objCliente;
    FormularioSalida objSalida;

    public Control() {
        objPpal = new FormularioPrincipal();
        objEntrada = new FormularioEntrada();
        objCliente = new Cliente();
        objSalida = new FormularioSalida();

        objPpal.getEscritorio().add(objEntrada);
        objPpal.getEscritorio().add(objSalida);
        objPpal.getMenuIEntrada().addActionListener(this);
        objPpal.getMenuISalida().addActionListener(this);
        objPpal.getMenuISalir().addActionListener(this);

        objEntrada.getBtnRegistrar().addActionListener(this);
        objEntrada.getBtnCancelar().addActionListener(this);
        objSalida.getBtnCancelar().addActionListener(this);
        objSalida.getBtnSalida().addActionListener(this);
    }

    public void Iniciar() {
        objPpal.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == objPpal.getMenuIEntrada()) {
            objEntrada.getTxtPlaca().setText("");
            objEntrada.getTxtHEntrada().setText("");
            objEntrada.getTxtIdentificacion().setText("");
            objEntrada.getTxtNombre().setText("");
            objEntrada.getLblConfirmacion().setText("");
            objSalida.getLblConfirmacion1().setText("");
            objSalida.setVisible(false);
            objEntrada.setVisible(true);
        }

        if (e.getSource() == objPpal.getMenuISalida()) {
            objSalida.getTxtIdentificacion().setText("");
            objSalida.getTxtHSalida().setText("");
            objSalida.getTxtPlaca().setText("");
            objSalida.getLblPCancelar().setText("");
            objSalida.getLblConfirmacion1().setText("");
            objEntrada.getLblConfirmacion().setText("");
            objEntrada.setVisible(false);
            objSalida.setVisible(true);
        }

        if (e.getSource() == objEntrada.getBtnCancelar()) {
            objEntrada.getLblConfirmacion().setText("");
            objEntrada.setVisible(false);
        }

        if (e.getSource() == objSalida.getBtnCancelar()) {
            objSalida.getLblConfirmacion1().setText("");
            objSalida.setVisible(false);
        }

        if (e.getSource() == objPpal.getMenuISalir()) {
            System.exit(0);
        }

        if (e.getSource() == objEntrada.getBtnRegistrar()) {
            String Placa = objEntrada.getTxtPlaca().getText();
            String hEntrada = objEntrada.getTxtHEntrada().getText();
            String Id = objEntrada.getTxtIdentificacion().getText();
            String Nombre = objEntrada.getTxtNombre().getText();
            String TipoVehiculo = "" + objEntrada.getCmbTVehiculo();
            if (objCliente.VHora(hEntrada) != -1) {
                if (!Placa.isEmpty() || !hEntrada.isEmpty() || !Id.isEmpty() || !Nombre.isEmpty() || !TipoVehiculo.isEmpty()) {
                    if (objCliente.buscarCarro(Placa) == null) {
                        Cliente nuevo = new Cliente();
                        nuevo.setId(objEntrada.getTxtIdentificacion().getText());
                        nuevo.setNombre(objEntrada.getTxtNombre().getText());
                        nuevo.setTipoVehiculo("" + objEntrada.getCmbTVehiculo());
                        nuevo.setPlaca(objEntrada.getTxtPlaca().getText());
                        nuevo.sethEntrada(Integer.parseInt(objEntrada.getTxtHEntrada().getText()));
                        boolean pudoParquear = objCliente.parquearCarro(nuevo);
                        if (pudoParquear) {
                            objEntrada.getLblConfirmacion().setText("El Vehiculo fue parqueado exitosamente.");
                        } else {
                            objEntrada.getLblConfirmacion().setText("El Parqueadero esta lleno.");
                        }
                    } else {
                        objEntrada.getLblConfirmacion().setText("Ya hay un vehiculo parqueado con esa placa.");
                    }
                } else {
                    objEntrada.getLblConfirmacion().setText("Faltan datos");
                }
            } else {
                objEntrada.getLblConfirmacion().setText("En la hora no puede poner letras y no puede estar vacia");
            }
        }

        if (e.getSource() == objSalida.getBtnSalida()) {
            String Id = objSalida.getTxtIdentificacion().getText();
            String hSalida = objSalida.getTxtHSalida().getText();
            String Placa = objSalida.getTxtPlaca().getText();
            if (objCliente.VHora(hSalida) != -1) {
                if (!Placa.isEmpty() || !hSalida.isEmpty() || !Id.isEmpty()) {
                    Cliente nuevo = new Cliente();
                    nuevo.sethSalida(Integer.parseInt(objSalida.getTxtHSalida().getText()));
                    objSalida.getLblPCancelar().setText(objCliente.precio(hSalida,Placa));
                    boolean pudoSacar = objCliente.sacarCarro(Placa);
                    if (pudoSacar) {
                        objSalida.getLblConfirmacion1().setText("El Vehiculo fue retirado exitosamente.");
                    } else {
                        objSalida.getLblConfirmacion1().setText("No se encuentra parqueado un vehiculo con esa placa");
                    }
                } else {
                    objSalida.getLblConfirmacion1().setText("Faltan datos");
                }
            } else {
                objSalida.getLblConfirmacion1().setText("En la hora no puede poner letras y no puede estar vacia");
            }
        }
    }
}
