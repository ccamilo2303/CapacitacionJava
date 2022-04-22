package com.mch.service;

import com.mch.interfaces.BancoInterface;

public class BBVAService implements BancoInterface {
	// BBVA mostrar los números primos hasta el 50
	@Override
	public void calcularCartera() {
		StringBuilder numerosPrimos = new StringBuilder("");

		for (int i = 0; i <= 50; i++) {
			// El 0, 1 y 4 no son primos
			if (determinarEsPrimo(i)) {
				numerosPrimos.append(i);
			}
		}
		System.out.println(numerosPrimos);
	}

	private boolean determinarEsPrimo(int numero) {
		int contador = 0;
		for (int j = 1; j <= numero; j++) {
			if ((numero % j) == 0) {
				contador++;
			}
		}
		if (contador <= 2) {
			return true;

		} else {
			return false;
		}

	}

}