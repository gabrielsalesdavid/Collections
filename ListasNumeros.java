package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListasNumeros {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
	numeros.add(1992);
	numeros.add(2014);
	numeros.add(2018);
	
	System.out.println(numeros.get(2));
	
	Collections.sort(numeros);
	
	for(int i = 0; i < numeros.size(); i++) {
		System.out.println(numeros.get(i));
	   }
	}

}
