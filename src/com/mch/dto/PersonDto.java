package com.mch.dto;

// Plantilla de software donde se "definen" los atributos/comportamientos
public class PersonDto {

    /*
     * para esta clase se esta usando el pilar encapsulamiento
     */
    private String name;
    private int ege;


    // Por defecto el constructor que se ejecuta es el vacío
    public PersonDto(){}

    // Es un método que se llama automáticamente cada vez que se crea(instancia) un
    // objeto
    public PersonDto(String name) {
        this.name = name;
    }

    // Metodo con el mismo nonmbre la clase que define los parametros de entrada
    // al momento de instaciarlo, tambien inicializa las valiables que recibe.
    public PersonDto(String name, int ege) {
        this.name = name;
        this.ege = ege;
    }

    public String getName() {
        return this.name;
    }

    public int getEge() {
        return this.ege;
    }

    public void setName(String name) {// en java la primera letra de las variables se escribe en minúscula
        this.name = name;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

}