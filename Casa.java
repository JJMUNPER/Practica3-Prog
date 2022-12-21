package org.Ejercicios.Practica3;

public class Casa {

    //Constantes
    final static Double IVA=1.21;
    final static Double IVARE=1.16;

    //Campos
    private Double precio;
    private char calificacion;
    private String catastro;



    //Metodos

    //Metodo para calcular precio con Iva

    public Double calIva(){

        precio =precio*IVA;

        return precio;
    }

    //Metodo para calcular precio con Iva reducido

    public Double calIvaRe(){

        precio=precio * IVARE;
        return precio;
    }

    //Metodo para imprimir


    protected String print(String catastro){

        calIva();
        calIvaRe();
        System.out.println("Referencia catastral: " + catastro + " precio sin IVA: " + precio + " con IVA: " + calIva()
        + " precio IVA reducido: " + calIvaRe());
        return catastro;

    }


}
