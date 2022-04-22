package com.mch.service;

import com.mch.interfaces.BancoInterface;

public class BancolombiaService implements BancoInterface {

    @Override

    public void calcularCartera() {
        Integer i;
        StringBuilder numeros = new StringBuilder();
        for (i = 1; i <= 20; i++) {
            numeros.append(i.toString() + ",");
        }
        System.out.println(numeros);
    }
}
