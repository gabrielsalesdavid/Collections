package br.com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.modificadoresdeacesso.Cliente;

public class ListaClientes {

	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();
		
		Cliente cli1 = new Cliente(27, "Gabriel Sales", "Rua coisa chato");
		Cliente cli2 = new Cliente(5, "Bryan Gabriel", "Rua coisa feia");
		Cliente cli3 = new Cliente(1, "Rebeca Vitoria", "Rua amorzão");
		
		clientes.add(cli1);		
		clientes.add(cli2);
		clientes.add(cli3);
		
		Collections.sort(clientes);
		
		for(Cliente cliente : clientes) {
			System.out.println(cliente);
		}
	}

}
