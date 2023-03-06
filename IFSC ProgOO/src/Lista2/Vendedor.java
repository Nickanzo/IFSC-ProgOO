package Lista2;

import java.util.Scanner;

public class Vendedor {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String nome;
		
		double salario, vendas, comissao;
		
		System.out.println("Insira nome do vendedor:");
		
		nome = s.nextLine();
		
		System.out.println("Insira o salario do vendedor:");
		
		salario = s.nextFloat();
		
		System.out.println("Insira o valor das vendas efetuadas pelo vendedor no mes:");
		
		vendas = s.nextFloat();
		
		comissao = ( vendas * 0.15 );
		
		System.out.println("Para o vendedor " + nome + " seu salario sera aumentado de " + salario + " para " + (salario + comissao)
				+ " por causa do seu 15% de comissao");
		
		
	}
}
