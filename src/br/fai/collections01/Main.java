package br.fai.collections01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		

	}
	private Scanner scanner = new Scanner(System.in);
	private final String VALOR_INVALIDO="VALOR_INVALIDO";
	private void start() {
		List <String> lista = new ArrayList<String>();
		
			
			while(lista.size()<5) {
				String valorRecebido= obterDados();
				
				//System.out.println("O valor recebido foi: "+valorRecebido);
				if(valorRecebido.isEmpty()
					|| valorRecebido.equals (VALOR_INVALIDO)) {
					System.out.println("Este valor foi descartado");
				}
				else {
					lista.add(valorRecebido);
				}
				
			}
			System.out.println("---------------");
			for (String item : lista) {
				System.out.println("O item da lista eh: "+ item);
			}
	}
	
	private String obterDados() {
		try {
			System.out.println("Digite o valor: ");
			int valor= scanner.nextInt();
			
			return String.valueOf(valor);
		} catch (Exception e) {
			scanner.next();
			System.out.println("Um valor invalido foi digitado");
		return VALOR_INVALIDO;
		
		}
		
	}

}
