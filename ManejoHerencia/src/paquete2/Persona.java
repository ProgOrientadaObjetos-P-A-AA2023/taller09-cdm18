/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author carlo
 */
public class Persona {
   protected String nombre;
   protected String apellido;
   protected String username;

    public Persona(String n, String a, String u) {
        nombre = n;
        apellido = a;
        username = u;
    }

    public void setNombre(String n) {
        nombre = n;
    }

    public void setApellido(String a) {
        apellido = a;
    }

    public void setUsername(String u) {
        username = u;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsername() {
        return username;
    }
   
    
    
   
   
   
}
