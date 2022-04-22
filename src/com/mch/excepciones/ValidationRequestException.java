package com.mch.excepciones;

public class ValidationRequestException extends Exception{


    /*
        Responsabilidad única
         * Cada clase solo debe tener un motivo para ser modificada
        Controller // La capa expuesta
         * Filtro de seguridad
         * Captura manejo de exceptions
         * Generar y mapear las respuestas
        Service    // La capa de negocio
         * Validators --
         * Helpers
         * Utils
         * inyecciones de dependencia     
        DAO        // La capa de datos
         * Solo consultas y trasnformación de la información
         * pool de conexiones
         * ORM (Hibernate)
         * OQM (MyBatis)
         * Spring Data
         * Spring repository
         * ...
    */

    public ValidationRequestException(String message){
        super(message); // super ejecuta el constructor de la clase padre
    }

    //////////////////////////////////////
    // throws => es una palabra reservada de java que indica que un método puede
    // generar una excepción x
    // metodo 1
    // RuntimeException
    // IndexOfException
    // TheadException
    // SQLException
    // xxxConnectionException
    // ..
    // ..
    public void metodo1() throws Exception {
        System.out.println("hola desde el metodo1");
    }

    //////////////////////////////////////
    // metodo2
    // try - catch es la estructura que controla y capturas las excepciones
    // que se puedan controlar/generar
    public void Prueba() {
        try {
            // Código
        } catch (Exception e) {
            System.out.println("Excepción" + e);
        }

    }

}
