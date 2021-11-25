package controller;

import br.edu.fateczl.HenriqueNeves.listaencadeada.integer.ListaEncadeadaSimples;

public class ListaController {
	
	public ListaController(){
		super();
	}
	
	public boolean ordenado(ListaEncadeadaSimples lista){
		
		int tamanho = lista.getTamanho();
		int aux = lista.pegaElemento(0);
		int anterior = lista.pegaElemento(0);
		boolean ordenado = false;
		
		for(int i = 0; i <= tamanho; i++){
			aux = lista.pegaElemento(i);
			if(aux >= anterior){
				ordenado = true;
			} else {
				return false;
			}
			
			anterior = aux;
		}
		
		return ordenado;
	}
	
	public int procuraNumeroRecursivamente(ListaEncadeadaSimples lista, int tamanho, int elemento){
		
		if(tamanho == 0){
			return 0;
		} else {
			int cont = 0;
			if(lista.pegaElemento(tamanho - 1) == elemento){
				cont++;
			}
			
			return cont + procuraNumeroRecursivamente(lista, tamanho - 1, elemento);
		}
	}
	
	public int procuraNumeroIterativamente(ListaEncadeadaSimples lista, int elemento){
		int tamanho = lista.getTamanho();
		int cont = 0;
		
		for(int i = 0; i <= tamanho - 1; i++){
			if(elemento == lista.pegaElemento(i)){
				cont++;
			}
		}
		
		return cont;
	}

}
