/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import static java.util.Locale.US;
import java.util.Scanner;
import paquete2.*;
import paquete4.*;
import paquete3.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(US);
        boolean bandera = true;
        int opcion;
        String cadena = "";

        while (bandera) {
            try {

                System.out.println("------------------------------------BIENVENIDO"
                        + "------------------------------------");
                System.out.println("Por favor, para solicitar un prestamo, "
                        + "llene los siguientes lineamientos generales");
                System.out.println("---------DATOS GENERALES DEL CLIENTE---------");
                System.out.println("\tIngrese el nombre del beneficiario");
                System.out.print("\t->");

                String nombre = sc.nextLine();
                System.out.println("\tIngrese el apellido del beneficiario");
                System.out.print("\t->");

                String apellido = sc.nextLine();

                System.out.println("\tIngrese un usuario identificativo");
                System.out.print("\t->");

                String username = sc.nextLine();

                Persona p1 = new Persona(nombre, apellido, username);

                System.out.println("");

                System.out.println("------------------"
                        + "---------------SECCION DE PRESTAMOS"
                        + "-----------------------------");

                System.out.printf("1. Ingrese 1 para ingresar los datos de solicitud de"
                        + " un préstamo de tipo automovil\n"
                        + "2. Ingrese 2 para ingresar los datos de solicitud de"
                        + " un préstamo de tipo educativo\n");
                System.out.print("\t->");
                opcion = sc.nextInt();

                sc.nextLine();

                if (opcion == 1) {
                    System.out.println("------------------"
                            + "-----------DATOS GENERALES DEL PRESTAMO"
                            + "------------------------");
                    System.out.println("\tIngrese el tiempo (en meses) para que el quiere pagar"
                            + " el prestamo");
                    System.out.print("\t->");
                    int numMeses = sc.nextInt();

                    sc.nextLine();

                    System.out.println("\tIngrese la ciudad de donde hace el prestamo");
                    System.out.print("\t->");

                    String ciudad = sc.nextLine();

                    Prestamo p = new Prestamo(p1, numMeses, ciudad);

                    System.out.println("---------PRESTAMO TIPO AUTOMÓVIL"
                            + "---------");

                    System.out.println("Ingrese el tipo de automovil");
                    String tipo = sc.nextLine();
                    System.out.println("Ingrese la marca del automovil");
                    String marca = sc.nextLine();
                    System.out.println("Por favor, ingrese los datos "
                            + "del garante");
                    System.out.print("\t>Nombre: ");
                    String nombreG = sc.nextLine();
                    System.out.print("\t>Apellido: ");
                    String apellidoG = sc.nextLine();
                    System.out.print("\t>Usuario identificativo: ");
                    String usernameg = sc.nextLine();

                    System.out.println("Ingrese el valor del automovil");
                    double valor = sc.nextDouble();
                    Persona g1 = new Persona(nombreG, apellidoG, usernameg);

                    PrestamoAutomovil pA = new PrestamoAutomovil(tipo, marca,
                            g1, valor, p1, numMeses, ciudad);
                    pA.calcularMensualidadAuto();

                    sc.nextLine();

                    System.out.printf("Si desea salir del programa pulse x,"
                            + " o si desea seguir ingresando ingrese "
                            + "cualquier letra\n");

                    System.out.print("\t->");
                    String salir = sc.nextLine();

                    cadena = cadena + pA;

                    if (salir.equals("x") || salir.equals("X")) {
                        System.out.println("Sus solicitudes de prestamos son:");

                        System.out.println(cadena);

                        bandera = false;

                    }

                }

                if (opcion == 2) {
                    System.out.println("------------------"
                            + "-----------DATOS GENERALES DEL PRESTAMO"
                            + "------------------------");
                    System.out.println("\tIngrese el tiempo (en meses) para el "
                            + "que quiere pagar el prestamo");
                    System.out.print("\t->");
                    int numMeses = sc.nextInt();

                    sc.nextLine();

                    System.out.println("\tIngrese la ciudad de donde hace el prestamo");
                    System.out.print("\t->");

                    String ciudad = sc.nextLine();

                    Prestamo p = new Prestamo(p1, numMeses, ciudad);

                    System.out.println("---------PRESTAMO TIPO EDUCATIVO"
                            + "---------");

                    
                    System.out.println("Ingrese el nombre del centro educativo");
                    String centro = sc.nextLine();
                    System.out.println("Ingrese las siglas del centro educativo");
                    String siglas = sc.nextLine();
                    System.out.println("Ingrese el nivel de estudio");
                    String nivel = sc.nextLine();                   
                    System.out.println("Ingrese el valor de la carrera");
                    double valorCarrera = sc.nextInt();
                    
                    InstitucionEducativa i = new InstitucionEducativa
                                                            (centro, siglas);
                    
                    PrestamoEducativo pE = new PrestamoEducativo(nivel, i,
                            valorCarrera, p1, numMeses, ciudad);
                    pE.calcularMensualidadCarrera();

                    sc.nextLine();

                    System.out.printf("Si desea salir del programa pulse x,"
                            + " o si desea seguir ingresando ingrese "
                            + "cualquier letra\n");

                    System.out.print("\t->");
                    String salir = sc.nextLine();

                    cadena = cadena + pE;

                    if (salir.equals("x") || salir.equals("X")) {
                        System.out.println("----------------------------------");
                        
                        System.out.println("Sus solicitudes de prestamos son:");

                        System.out.println(cadena);
                        
                        System.out.println("Gracias, vuelva pronto!");
                        bandera = false;

                    }

                }

            } catch (InputMismatchException e) {
                sc.nextLine();
                System.err.println("Por favor ingrese un numero");
            }

        }

    }
}
