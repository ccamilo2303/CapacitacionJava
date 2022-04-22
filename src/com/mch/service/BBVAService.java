package com.mch.service;

import com.mch.interfaces.BancoInterface;

public class BBVAService implements BancoInterface {
	// BBVA mostrar los números primos hasta el 50
	@Override
	public  void calcularCartera() {
		StringBuilder numerosPrimos = new StringBuilder("");
		for (int i = 0; i <= 50; i++) {
			// El 0, 1 y 4 no son primos
			if (i == 0 || i == 1 || i == 4) {
				continue;
			}
			for (int x = 2; x < i / 2; x++) {
				// Si es divisible por cualquiera de estos números, no es primo
				if (i % x == 0)
					continue;
			}
			numerosPrimos.append(i);
		}
		System.out.println(numerosPrimos);
	}


}