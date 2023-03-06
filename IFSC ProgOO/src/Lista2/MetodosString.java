package Lista2;

import java.util.Iterator;
import java.util.Scanner;

public class MetodosString {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String frase, inverso;
		
		char[] array;
		
		int tamanho;
		
		System.out.println("Escreva uma frase:");
		
		frase = s.nextLine();
		
		tamanho = frase.length();
		
		inverso = new StringBuilder(frase).reverse().toString();
		
		System.out.println("Tamanho da frase: " + tamanho);
		
		System.out.println("Inverso da frase: " + inverso);
		
		array = frase.toCharArray();
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}
}
