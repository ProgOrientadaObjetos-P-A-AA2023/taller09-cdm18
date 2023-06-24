/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;


/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int mes;
    protected String ciudad;

    public Prestamo(Persona b, int m, String c) {
        beneficiario = b;
        mes = m;
        ciudad = c;
    }

    public void setBeneficiario(Persona b) {
        beneficiario = b;
    }

    public void setMes(int m) {
        mes = m;
    }

    public void setCiudad(String c) {
        ciudad = c;
    }

    public Persona getBeneficiario() {
        return beneficiario;
    }

    public int getMes() {
        return mes;
    }

    public String getCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String mensaje = "";
        mensaje = String.format("%s\nCLIENTE:\n"
                + "Nombre del cliente: %s\n"
                + "Apellido del cliente: %s\n"
                + "Username del cliente: %s\n"
                + "Tiempo del prestamo: %d mes/meses\n"
                + "Ciudad del prestamo: %s\n",
                mensaje,
                beneficiario.nombre,
                beneficiario.apellido,
                beneficiario.username,
                getMes(),
                getCiudad());

        return mensaje;
    }

}
