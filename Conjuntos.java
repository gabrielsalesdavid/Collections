package br.com.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		Set<String> nomes = new HashSet<String>();
		Scanner teclado = new Scanner(System.in);
		boolean res;
		
		//nomes.add("Rebeca");
		//nomes.add("Vitoria");
		//nomes.add("Bryan");
		//nomes.add("Gabriel");
		//nomes.add("Sales");
		//nomes.add("Gabriel");
		
		//System.out.println(nomes.add("Pedro"));
		
		//System.out.println(nomes.size());
		
		//System.out.println(nomes.contains("Bryan"));
		
		// Collections.sort(nomes);
		
		//for(String nome : nomes) {
		//	System.out.println(nome);
		//}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Informe o " + (i+1) + " nome: ");
			String nome =teclado.nextLine();
			res = nomes.add(nome);
			
			if(!res) {
				System.out.println("Não pode repetir o nome!" );
				i--;
			}
		}
		
		System.out.println("Nomes no conjuntos temos " + nomes.size() + " elementos");
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		teclado.close();
	}

}
