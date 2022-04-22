package com.mch.service;

import com.mch.interfaces.BancoInterface;

public class BBVA implements BancoInterface{

	@Override
	public void calcularCartera() {

        StringBuilder numerosPrimos=new StringBuilder("");
        for(int i=0;i<=50;i++){

            if (i == 0 || i == 1 || i == 4) {
                continue;
             }

          if( i%2 ==0){
           numerosPrimos.append(i);
          }
        }
         System.out.println(numerosPrimos);

		// TODO Auto-generated method stub
		
	}

//BBVA mostrar los números primos hasta el 50





}