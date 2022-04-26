package com.mch.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class EjercicioHiloAdrianMain {
  public static void main(String[] args) {

    long startTime = System.currentTimeMillis();
    PrintNumbersFile();
    long endTime = System.currentTimeMillis() - startTime;
    System.out.println("El método sin hilos se demoró: " + endTime);

//MÉTODO CON HILO 1

   startTime = System.currentTimeMillis();
        Runnable tarea = () ->{
           PrintNumbersFile();
        };

        Thread hilo1 = new Thread(tarea);
        hilo1.start();

   endTime = System.currentTimeMillis() - startTime;
   System.out.println("El método con hilo 1 se demoró: " + endTime);

   //MÉTODO CON HILO 2

  startTime = System.currentTimeMillis();
           tarea = () ->{
           PrintNumbersFile();
        };

        Thread hilo2 = new Thread(tarea);
        hilo2.start();

   endTime = System.currentTimeMillis() - startTime;
   System.out.println("El método con hilo 2 se demoró: " + endTime);

  }

  

  public static void PrintNumbersFile() {

    BufferedWriter output = null;
    try {

      File archivo = Files.createTempFile("archivoCapacitacionJavaADRIAN", ".txt").toFile();
      output = new BufferedWriter(new FileWriter(archivo));
      for (Integer i = 1; i <= 500000; i++) {
        output.write(i.toString());
      }

    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      if (output != null) {
        try {
          output.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }

    }

  }

}
