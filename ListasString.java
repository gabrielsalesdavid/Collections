package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ListasString {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Rebeca");
		nomes.add("Vitoria");
		nomes.add("Bryan");
		nomes.add("Gabriel");
		nomes.add("Gabriel");
		nomes.add("Sales");
		
		//nomes.add(50);
		//nomes.add(true);
		//nomes.add(15.6);
		//nomes.add('e');
		
		//System.out.println(nomes.get(1));
		//System.out.println(nomes.get(0));
		
		//System.out.println(nomes.size());
		
		//for(int i = 0; i < nomes.size(); i++) {
		//	System.out.println(nomes.get(i));
		//}
		
		Collections.sort(nomes);
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
	}

}
