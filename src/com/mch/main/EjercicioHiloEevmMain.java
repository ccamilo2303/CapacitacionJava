package com.mch.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;

public class EjercicioHiloEevmMain {

	/**
	 * 1) Hacer un método que escriba un archivo temporal con información de los
	 * números del 1 al 500.000
	 * 2) Ejecutar el método y sacar cuanto tiempo demora en ejecutarse
	 * 3) Crear dos hilos y que cada hilo realice el llamado al método de escribe el
	 * archivo
	 * 4) Tomar el tiempo que demore en ejecutar el programa con 2 hilos
	 */

	public void crearAcrhivoTemporal(String name) {
		try {
			long tiempoInicio = System.currentTimeMillis();
			StringBuilder numeros = new StringBuilder("");
			File archivoNumeros = Files.createTempFile(name, ".txt").toFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(archivoNumeros));
			for (int i = 0; i <= 1000000; i++) {
				numeros.append(i).append(" ");
			}
			
			out.write(numeros.toString());
			out.flush();
			out.close();
			long tiempoFinaliza = System.currentTimeMillis() - tiempoInicio;
			System.out.println("Duración en ejecucion metodo crearAcrhivoTemporal(name) creando el archivo " + name
					+ " : " + tiempoFinaliza + " milisegundos.");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		long tiempoInicio = System.currentTimeMillis();
		EjercicioHiloEevmMain ejercicioHiloEevmMain = new EjercicioHiloEevmMain();
		ejercicioHiloEevmMain.crearAcrhivoTemporal("archivoNumerosEevm_");
		
		Runnable hilo1 = () -> {
			ejercicioHiloEevmMain.crearAcrhivoTemporal("archivoNumerosEevm1_");

		};
		Runnable hilo2 = () -> {
			ejercicioHiloEevmMain.crearAcrhivoTemporal("archivoNumerosEevm2_");

		};

		Thread ejecucionHilo1 = new Thread(hilo1);
		Thread ejecucionHilo2 = new Thread(hilo2);

		ejecucionHilo1.start();
		ejecucionHilo2.start();

		long iniciaCiclo = System.currentTimeMillis();
		boolean continuar = true;
		long teminaiteracion;
		while ((ejecucionHilo1.isAlive() || ejecucionHilo2.isAlive()) && continuar) {
			
			 teminaiteracion = System.currentTimeMillis() - iniciaCiclo;
			//System.out.println("..."+teminaiteracion);
			if (teminaiteracion >= 3000 || (!ejecucionHilo1.isAlive() && !ejecucionHilo2.isAlive())) {
				continuar = false;
			}
		}

		long tiempoFinaliza = System.currentTimeMillis() - tiempoInicio;
		long tiempoFinalizaWhile = System.currentTimeMillis() - iniciaCiclo;
		System.out.println("Duración en ejecucion metodo Main() con el WHILE : " + tiempoFinaliza + " milisegundos.");
		System.out.println("Duración en ejecucion metodo Main() SIN el WHILE : " + (tiempoFinaliza-tiempoFinalizaWhile) + " milisegundos.");


	}
}
