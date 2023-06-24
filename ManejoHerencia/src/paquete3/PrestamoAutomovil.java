/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    protected String tipo;
    protected String marca;
    protected Persona garante1;
    protected double valor;
    protected double mensualidadAuto;

    public PrestamoAutomovil(String t, String mark, Persona g1, double v,
            Persona b, int m, String c) {
        super(b, m, c.toLowerCase());
        tipo = t;
        marca = mark;
        garante1 = g1;
        valor = v;
    }

    public void setTipo(String t) {
        tipo = t;
    }

    public void setMarca(String m) {
        marca = m;
    }

    public void setGarante1(Persona g) {
        garante1 = g;
    }

    public void setValor(double v) {
        valor = v;
    }

    public void calcularMensualidadAuto() {
        mensualidadAuto = valor / mes;
    }

    @Override
    public void setCiudad(String c) {
        ciudad = c;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public Persona getGarante1() {
        return garante1;
    }

    public double getValor() {
        return valor;
    }

    public double getMensualidadAuto() {
        return mensualidadAuto;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje = String.format("%s%s\n"
                + "PRESTAMO DE TIPO AUTOMOVIL\n"
                + "Tipo de auto: %s\n"
                + "Marca de auto: %s\n"
                + "Datos del garante: \n"
                + "\tNombre del garante: %s\n"
                + "\tApellido del garante: %s\n"
                + "\tUsername del garante: %s\n"
                + "Valor del automovil: %.2f USD\n"
                + "Valor mensual total a pagar de prestamo automovil: %.2f USD\n"
                + "--------------------------------------------------------------",
                mensaje,
                super.toString(),
                tipo,
                marca,
                garante1.getNombre(),
                garante1.getApellido(),
                garante1.getUsername(),
                valor,
                mensualidadAuto);

        return mensaje;
    }

}
