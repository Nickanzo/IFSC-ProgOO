package Lista2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		
		int num, num2, soma, subtracao, multiplicacao, divisao;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insira um numero:");
		
		num = s.nextInt();
		
		System.out.println("Insira mais um numero:");
		
		num2 = s.nextInt();
		
		soma = num + num2;
		
		System.out.println("A soma dos numeros: " + soma);
		
		subtracao = num - num2;
		
		System.out.println("A subtração dos numeros: " + subtracao);
		
		multiplicacao = num * num2;
		
		System.out.println("A multiplicação dos numeros: " + multiplicacao);
		
		divisao = num / num2;
		
		System.out.println("A divisão dos numeros: " + divisao);
		
	}
}
