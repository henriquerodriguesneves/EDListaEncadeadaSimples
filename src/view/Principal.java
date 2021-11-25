package view;

import br.edu.fateczl.HenriqueNeves.listaencadeada.integer.ListaEncadeadaSimples;
import br.edu.fateczl.HenriqueNeves.listaencadeada.integer.No;
import controller.ListaController;

public class Principal {
	
	public void main (String[] args) {
		
		ListaEncadeadaSimples lista = new ListaEncadeadaSimples();
		ListaController controller = new ListaController();
		
		lista.adcionaPrimeiroElemento(new No(10));
		
		for(int i = 1; i <10; i++){
			lista.adicionaElelmento(new No(i));
		}
		
		lista.adcionaPrimeiroElemento(new No(10));
		lista.adcionaPrimeiroElemento(new No(10));
		lista.adcionaPrimeiroElemento(new No(10));
		
		System.out.println(controller.ordenado(lista));
		System.out.println(controller.procuraNumeroRecursivamente(lista, lista.getElemento(), 20));
		System.out.println(controller.procuraNumeroIterativamente(lista, 20));
		
		
		System.out.println(lista.toString());
		
	}

}
