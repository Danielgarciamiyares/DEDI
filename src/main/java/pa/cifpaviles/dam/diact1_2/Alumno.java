/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pa.cifpaviles.dam.diact1_2;

import java.util.ArrayList;

/**
 *
 * @author danielgarcia
 */
public class Alumno 
{
   /**
    * Atributos
    * 
    */
   private String nombre;
   private String apellidos;
   private String email;
   private int edad;
   private String telefono;

   /*Getters y Setters*/
    /**
     * @return the nombre
     */
    public String getNombre() 
    {
        return nombre;
    }
    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    /**
     * @return the apellidos
     */
    public String getApellidos() 
    {
        return apellidos;
    }
    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) 
    {
        this.apellidos = apellidos;
    }
    /**
     * @return the email
     */
    public String getEmail() 
    {
        return email;
    }
    /**
     * @param email the email to set
     */
    public void setEmail(String email) 
    {
        this.email = email;
    }
    /**
     * @return the edad
     */
    public int getEdad() 
    {
        return edad;
    }
    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) 
    {
        this.edad = edad;
    }
    /**
     * @return the telefono
     */
    public String getTelefono() 
    {
        return telefono;
    }
    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) 
    {
        this.telefono = telefono;
    }
    /*Constructores*/
    public void Alumno()
    {
        
    }
    public void Alumno(String nombre,String apellidos,int edad)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
    }
    public void Alumno(String nombre,String apellidos,String email,int edad,String telefono)
    {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.email=email;
        this.edad=edad;
        this.telefono=telefono;
    }
    /*Metodos*/
    public boolean ComprobarEdad(Alumno a)
    {
        boolean MayorEdad=false;
        
        if(a.getEdad()>=18)
        {
            MayorEdad=true;
            System.out.println("El alumno "+a.getNombre()+" "+a.getApellidos()+" es mayor de edad");
        }
        else
        {
            MayorEdad=false;
            System.out.println("El alumno "+a.getNombre()+" "+a.getApellidos()+" es menor de edad");
        }
        
        return MayorEdad;
    }
    
   private static Alumno[] ArrayAlumnos=new Alumno[5];
}
