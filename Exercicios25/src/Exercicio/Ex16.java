package Exercicio;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		

		 Scanner teclado = new Scanner(System.in);

	        int somaIdades = 0;
	        int quantidadePessoas = 20;

	        System.out.println("Digite as idades de " + quantidadePessoas + " pessoas:");

	        for (int i = 1; i <= quantidadePessoas; i++) {
	            System.out.print("Idade da pessoa " + i + ": ");
	            int idade = teclado.nextInt();
	            somaIdades += idade;
	        }

	        double mediaIdades = (double) somaIdades / quantidadePessoas;

	        System.out.println("A m�dia das idades das " + quantidadePessoas + " pessoas �: " + mediaIdades);

	        teclado.close();
		
	}

}
