package com.mch.service;

import com.mch.interfaces.BancoInterface;

public class DaviviendaService implements BancoInterface {
    //Davivienda: mostrar los números del -1 al -30 separados por un guion "-

    public DaviviendaService() {

    }
    @Override
    public void calcularCartera(){
     StringBuilder numeros=new StringBuilder("");   
     for( int i=1;i<=30;i++){
         numeros.append(String.valueOf(i*-1));
     }
    System.out.println(numeros);
    }

}