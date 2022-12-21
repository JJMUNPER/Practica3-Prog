package org.Ejercicios.Practica3;

public class Alumno {

    //Campos

    private String nombre;
    private String apellidos;
    private int edad;
    private Boolean repetidor;
    private Double notaMeida;
    private String correo;
    public Direccion direccion;


    //Constructores

    public Alumno(){

    }

    //Constructor para modificar alumno

    public Alumno(String nombre, String apellidos, int edad, Double notaMeida, String correo){

        this.nombre=nombre;
        this.apellidos=apellidos;
        this.edad=edad;
        this.notaMeida=notaMeida;
        this.correo=correo;


    }



    //Metodos

    //Metodo para imprimir nombre, apellidos y la edad

    public void imprime(){

        System.out.println("Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad);

    }
}
