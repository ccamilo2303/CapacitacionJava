package com.mch.main;

import java.io.File;
import java.nio.file.Files;

public class HiloMain {

    /**
     * * Debo investigar algo ? => S/N => SI
     * * Conozco de memória la solución ?   S/N => NO
     * * Si todo sale BIEN cuanto me podría demorar ? => min/h 30 min
     * * Cual es el pero escenario al cual me puede enfrentar ? 5
     * ** Siempre hay que dar el tiempo de la peor situación **
     * ** Posibles interrupciones
     * * >No hay que ser optimistas<
     * Emanuel  = 45 min
     * Adrián   = 30 min
     * Cristian = 1h
     * 
     * 1) Hacer un método que escriba un archivo temporal con información de los números del 1 al 500.000
     * 2) Ejecutar el método y sacar cuanto tiempo demora en ejecutarse
     * 3) Crear dos hilos y que cada hilo realice el llamado al método de escribe el archivo
     * 4) Tomar el tiempo que demore en ejecutar el programa con 2 hilos
     */


    public static void printNumbers(){

        

        for(int x = 0 ; x <= 10 ; x ++){
            System.out.print(" "+x);
        }
        System.out.println("");
    }

    // La palabra synchronized se usa cuando necesito que un método
    // se ejecute solo 1 vez por hilo
    public synchronized void exec(String name){
        for(int x = 0 ; x <= 10 ; x ++){
            System.out.print(" ("+name+"="+x+")");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        // Un hilo permite ejecutar varios procesos de forma simultánea
        // Esto hace cumplir la característica de java: multiproceso
        // Implementación java 7
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run(){

            }
        });
        hilo1.run();
        ////////////////////////////////////////////////////
      
        //System.out.println("Hola ");
        
        Runnable tarea = () ->{
            //System.out.println("Hola desde hilo");
            for(int x = 11 ; x <= 20 ; x ++){
                System.out.print(" "+x);
            }
            System.out.println("");
        };

        Thread hilo2 = new Thread(tarea);
        //hilo2.start();

        //printNumbers();

        ////////////////////////////

        HiloMain hiloMain = new HiloMain();

        Runnable ejecucion1 = () ->{
            hiloMain.exec("Hilo1");
        };
        Runnable ejecucion2 = () ->{
            hiloMain.exec("Hilo2");
        };
        Runnable ejecucion3 = () ->{
            hiloMain.exec("Hilo3");
        };
        Thread hiloEjecucion1 = new Thread(ejecucion1);
        Thread hiloEjecucion2 = new Thread(ejecucion2);
        Thread hiloEjecucion3 = new Thread(ejecucion3);

        hiloEjecucion1.start();
        hiloEjecucion2.start();
        hiloEjecucion3.start();

        try{

            File archivo = Files.createTempFile("archivoCapacitacionJava", ".txt").toFile();

        }catch(Exception e){
            e.printStackTrace();
        }


    }
}
