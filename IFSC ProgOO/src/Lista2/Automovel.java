package Lista2;

import java.util.Scanner;

public class Automovel {

	
	public static void main(String[] args) {
		
		
		int distancia, combustivel;
		
		double consumo;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual a distância percorrida com o veículo em Km?");
		
		distancia = s.nextInt();
		
		System.out.println("Qual o combustível total gasto em Litros?");
		
		combustivel = s.nextInt();
		
		consumo = distancia / combustivel;
		
		System.out.println("O consumo medio do automovel foi: " + consumo);
		
	}
}
