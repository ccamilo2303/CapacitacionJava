package com.mch.main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.mch.dto.Ingeniero;
import com.mch.dto.Person;

public class Main {

    // Con la palabra new creo instancia de clase Person
    // Por medio de la instancia se crea un objeto que se guarda en memoria
    private Person person = new Person();
    // la variable person es la referencia de memoria para recuperar el obj


    // instancias, objetos, constructores (sintaxis de java)
    // sintaxis de punto


    /*
    Estructiras de control
       una estructura de control es aquella que see encarga de controlar una accion,
       define si se debe o no ejecutar sierto bloque de codigo, ej:

        Estructura condicional IF:

       if(true){
           mostrar el color rojo
       }else{
           mostrar el color amarillo
       }

       Estructura condicional switch:
       switch variable{
           case 'caso1':
            mostrar "1";
           breack;
           case 'caso2':
            mostrar "2";
           breack;
           default:
           "caso no contemplado"
           breack;
       }
       
       
    */

    /*
    Estructuras iterativas
    Son estructuras repetitivas: FOR, FOREACH, WHILE, DO WHILE
        For (i=1;i<6;i++){
            System.OutPrintln.("Hola Mundo")
        }
     
     Foreach(temp:array){

         
     }

     while(1<2){

         System.OutPrintln(Hola Mundo);
     }
     

    do{
        ///
    }while(true)


    */

    public void calcular(){

        //
        //
        //
        //
        //

    }


	public static void main(String[] args) {
        /* expresion lambda ?
            la expresion lambda, es traida de la programación funcional
            busca definir bloques anónimos de código, 
            que pueden o no recibir parámetros
            estos bloques de código, pueden retornar un valor
            existen desde java 1.8+ (java 1.5, 1.6, 1.7, >1.8, 9, 10, 11, 12, 13, 14, 15, 16, 17)
            GB => garbage collector
         */

        List<Person> personsList = new ArrayList<Person>();
        personsList.add(new Person()); // Está especializado en guardar
        // Wrapper
        int edad = 0;
        Integer edad2 = 0;
        // Lengujes  imperativos  => SQL    select nombre from users where edad = 2
        // Lenguajes declarativos => java.. if(...){ int x = 0; return false;}
        // Variables que infieren el tipo

        boolean z;
        /*
            Predicados ==> retornan un valor para evaluzar una condición
            Consumer  ==> Ejecutan una serie de instrucciones sin retornar un valor
        */

        


        personsList.stream().filter ( (person) -> person.getEge() == 2);

        //["Adrian", "Emanuel", "Cristian"]

        List<String> nombres = personsList
        .stream()
        .filter ( (person) -> person.getEge() == 2) // Se define un filter con una condicion
        .map( (person) -> person.getName())// El map sirve para transformar la entrada a cualquier salida
        .collect(Collectors.toList());// Me sirve para transformar el stream a una lista

        List<Ingeniero> ingenieros = personsList
        .stream()
        .filter ( (person) -> person.getEge() == 2) // Se define un filter con una condicion
        .map( (person) -> new Ingeniero("Ing Sistemas", person.getName()))// El map sirve para transformar la entrada a cualquier salida
        .collect(Collectors.toList());// Me sirve para transformar el stream a una lista

        List<Person> personsList3 = personsList
        .stream()
        .filter ( (person) -> person.getEge() == 2) // Se define un filter con una condicion
        .collect(Collectors.toList());// Me sirve para transformar el stream a una lista


        personsList.stream().forEach( (person) -> {
            if(person.getEge() == 2){
                System.out.println("Tiene 2");
            }
            
        });

        personsList.stream().forEach( (person) -> System.out.println(person));
        

        // f(x)
        //entrada -> (operador) {definición}

        List<Person> personsList2 = new LinkedList<Person>();
        personsList2.add(new Person());// Está especializado en buscar
        

	
        Person person1 = new Person();
        person1.getName();
        person1.setEge(1);

        System.out.println("Hola mundo");
	}
}
