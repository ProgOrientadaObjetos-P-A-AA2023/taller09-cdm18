/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.*;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    protected String nivel;
    protected InstitucionEducativa centroEducativo;
    protected double valorCarrera;
    protected double mensualidadCarrera;

    public PrestamoEducativo(String niv,
            InstitucionEducativa i1, double v, Persona b, int m, String c) {
        super(b, m, c.toUpperCase());
        nivel = niv;
        centroEducativo = i1;
        valorCarrera = v;

    }

    public void setNivel(String n) {
        nivel = n;
    }

    public void setCentroEducativo(InstitucionEducativa c) {
        centroEducativo = c;
    }

    public void setValorCarrera(double v) {
        valorCarrera = v;
    }

    public void calcularMensualidadCarrera() {
        double aux = valorCarrera / mes;
        mensualidadCarrera = aux - 0.1 * aux;

    }

    @Override
    public void setCiudad(String c) {
        ciudad = c.toUpperCase();
    }

    public String getNivel() {
        return nivel;
    }

    public InstitucionEducativa getCentroEducativo() {
        return centroEducativo;
    }

    public double getValorCarrera() {
        return valorCarrera;
    }

    public double getMensualidadCarrera() {
        return mensualidadCarrera;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje = String.format("%s%s\n"
                + "PRESTAMO DE TIPO EDUCATIVO\n"
                + "Nivel de estudio: %s\n"
                + "Centro educativo: %s (%s)\n"
                + "Valor de la carrera: %.2f USD\n"
                + "Valor mensual total a pagar de la carrera: %.2f USD\n"
                + "------------------------------------------------------",
                mensaje,
                super.toString(),
                nivel,
                getCentroEducativo().getNombre(),
                getCentroEducativo().getSiglas(),
                valorCarrera,
                mensualidadCarrera);

        return mensaje;
    }

}
