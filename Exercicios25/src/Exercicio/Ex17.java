package Exercicio;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		

		
		 Scanner teclado = new Scanner(System.in);

	        int quantidadePessoas = 20;
	        int maioresIdade = 0;

	        System.out.println("Digite as idades de " + quantidadePessoas + " pessoas:");

	        for (int i = 1; i <= quantidadePessoas; i++) {
	            System.out.print("Idade da pessoa " + i + ": ");
	            int idade = teclado.nextInt();

	            if (idade >= 18) {
	                maioresIdade++;
	            }
	        }

	        System.out.println("Quantidade de pessoas maiores de idade: " + maioresIdade);

	        teclado.close();
	}

}
