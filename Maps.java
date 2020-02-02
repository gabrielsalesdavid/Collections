package br.com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Maps {
	public static void main(String [] args) {
		Map<Integer, String> pessoas = new HashMap<Integer, String>();
		
		pessoas.put(5, "Bryan Gabriel");
		pessoas.put(1, "Rebeca Votira");
		pessoas.put(27, "Gabriel Sales");
		
		System.out.println("Chaves: " + pessoas.keySet());
		
		System.out.println("Valores: " + pessoas.values());
		
		System.out.println("Associações: " + pessoas.entrySet());
		
		pessoas.keySet().forEach(idade -> {
			System.out.println(pessoas.get(idade));
		});
		
		Set<Integer> chaves = pessoas.keySet();
		for(Integer idade : chaves) {
			System.out.println(pessoas.get(idade));
		}
		
		Collection<String> valores = pessoas.values();
		for(String nome : valores) {
			System.out.println(nome);
		}
		
		pessoas.values().forEach(nome -> {
			System.out.println(nome);
		});
		
		Set<Entry<Integer , String>> associacoes = pessoas.entrySet();
		for(Entry<Integer, String> associacao : associacoes) {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		}
		
		pessoas.entrySet().forEach(associacao -> {
			System.out.println(associacao.getKey() + " - " + associacao.getValue());
		});
	}
}
