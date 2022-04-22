package com.mch.main;

import java.util.List;

import java.util.ArrayList;

import com.mch.interfaces.BancoInterface;
import com.mch.service.BBVAService;

import com.mch.service.BancolombiaService;

import com.mch.service.DaviviendaService;

public class MainEjercicio {
    public static void main(String[] args) {

        List<BancoInterface> bancos = new ArrayList<BancoInterface>();
        bancos.add(new DaviviendaService());
        bancos.add(new BancolombiaService());
        bancos.add(new BBVAService());

        bancos.stream().forEach((banco) -> {
            banco.calcularCartera();
        });

    }
}