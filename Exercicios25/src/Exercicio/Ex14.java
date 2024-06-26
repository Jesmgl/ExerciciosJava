package Exercicio;


import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		

		 Scanner teclado = new Scanner(System.in);

	        int soma = 0;

	        System.out.println("Digite 10 n�meros:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("N�mero " + (i + 1) + ": ");
	            int numero = teclado.nextInt();
	            soma += numero;
	        }

	        System.out.println("A soma dos 10 n�meros �: " + soma);

	        teclado.close();
	
	}

}
