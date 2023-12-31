package Teste;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int [] Numeros = new int [5];
		
		for (int i =0; i<6; i++) {
		System.out.println("Digite um número: ");
		Numeros [i] = sc.nextInt();
		
		}
		for (int N: Numeros) {
			System.out.println(N);
			
		}
	}

}
