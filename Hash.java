package br.com.collections;

import java.util.HashMap;
import java.util.Map;

import br.com.modificadoresdeacesso.Cliente;
import br.com.modificadoresdeacesso.Conta;

public class Hash {

	public static void main(String[] args) {
		Map<String, Conta> contas = new HashMap<String, Conta>();
		
		Cliente cli1 = new Cliente(1, "Rebeca Vitoria", "Rua: amorzão, 2");
		Cliente cli2 = new Cliente(5, "Bryan Gabriel", "Rua: chato, 1");
		
		Conta c1 = new Conta(1, 500, 300, cli1);
		Conta c2 = new Conta(2, 500, 350, cli2);
		
		contas.put("Pessoa fisica", c1);
		contas.put("Pessoa juridica", c2);
		
		System.out.println(contas.size());
		
		System.out.println(contas.get("Pessoa juridica"));
	}

}
