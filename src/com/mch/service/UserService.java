package com.mch.service;

import com.mch.excepciones.ValidationRequestException;
import com.mch.validators.RequestValidator;

// Una clase service o bussines, indica que en esta capa van las reglas de negocio
// Buena práctica es indicar en el nombre de la clase a que capa corresponde (Controller, Service, DTO, DAO)
public class UserService {
    
    // private Logger log = new Logger(xxx);
    // buena práctica definir el alcance de las variables (public, private, default*)
    // buena práctica nombrar lo más claro posible las variables
    // siempre usar camelCase al nombrar variables o métodos ()
    // siempre usar UpperCamelCase para nombrar clases, interfaces, enums
    private RequestValidator requestValidator = new RequestValidator();
    

    public void createUser(String email, String pass){
        try{
            String nombres = new String("Cristian"); // ABC12345

            StringBuilder nombresBuilder = new StringBuilder("Cristian"); // 1 instancia
            
            // se recomienda en lo posible usar for each para evitar excepciones por IndexOfException
            for(int indice = 0 ; indice < 10 ; indice ++){
                // Concatenar cadenas de esta manera es una mala práctica
                nombres = nombres + " Camilo"; // nombres = new String("Cristian Camilo"); // ghj159
                // el operador de concatenación "+" crea una nueva instancia con el string concatenado
                // crea 10 instancias de string => consumo de memória RAM

                // Buena práctica
                nombresBuilder = nombresBuilder.append(" Camilo").append(" str").append(" str"); //Solo voy a manejar 1 instancia
                
            }

            nombres = nombresBuilder.toString(); // 1 instancia
            nombres = nombres.replace("target", "replacement"); // 1 instancia


            requestValidator.validateRequestPostUser(email, pass);
            // ..
            // ..
            // un catch de tipo Exception es una mala práctica
        }catch(ValidationRequestException e){
            // Mala práctica imprimir mensajes por consola con System.xxx.println
            System.err.println("Error personalizado: "+e.getMessage());
            
            //Mala práctica
            e.printStackTrace();// Imprime toda la trasa del error desde el origen

            // Buena práctica usar una librería Logger para este fin
            // log.error(e.getMenssage());

        }
    }

}
