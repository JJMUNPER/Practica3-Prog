package org.Ejercicios.Practica3;

public class Direccion {

    private String calle;
    private Integer numero;
    private String portal;
    private Integer codigoPostal;
    private String poblacion;
    private String provincia;

    //Constructores

    public Direccion(){

    }

    public Direccion(String calle, Integer numero, String portal, String provincia,String poblacion){

        this.calle=calle;
        this.numero=numero;
        this.portal=portal;
        this.provincia=provincia;
        this.poblacion=poblacion;
    }

    public Direccion(String calle, Integer numero, String portal, Integer codigoPostal,String poblacion){

        this.calle=calle;
        this.numero=numero;
        this.portal=portal;
        this.codigoPostal=codigoPostal;
        this.poblacion=poblacion;
    }


    //Metodos

    public void printDireccion(){
        System.out.println("Calle: " + calle + " Numero: " + numero + " C.P: " + codigoPostal+ " poblacion: " + poblacion + " provincia: " + provincia);
    }

    public void printDireccion(){
        System.out.println("Calle: " + calle + " Localidad: " + provincia);
    }



}
