package view;

import model.Fila;

public class Principal {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<>();
		boolean filaVazia = fila.isEmpty();
		System.out.println("Vazia? " + filaVazia);
		
		int tamanho = fila.size();
		System.out.println("Tamanho = " + tamanho);
		
		fila.insert(5);
		fila.insert(4);
		
		filaVazia = fila.isEmpty();
		System.out.println("Vazia? " + filaVazia);
		tamanho = fila.size();
		System.out.println("Tamanho = " + tamanho);
		
		fila.insert(3);
		fila.insert(2);
		fila.insert(1);
		fila.insert(0);
		
		try {
			fila.list();
			System.out.println("");
			System.out.println("=================================================");
			while(!fila.isEmpty()) {
				int valor = fila.remove();
				System.out.println(valor + " ");
			}
			
			System.out.println("");
			System.out.println("=================================================");
			int valor1 = fila.remove();			
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
