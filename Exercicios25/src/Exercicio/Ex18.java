package Exercicio;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		

		 Scanner teclado = new Scanner(System.in);

	        int quantidadePessoas = 10;
	        String nomeMaisNova = "";
	        int idadeMaisNova = Integer.MAX_VALUE; 
	      
	        System.out.println("Digite o nome e a idade de " + quantidadePessoas + " pessoas:");

	        for (int i = 1; i <= quantidadePessoas; i++) {
	            System.out.print("Nome da pessoa " + i + ": ");
	            String nome = teclado.nextLine();

	            System.out.print("Idade da pessoa " + i + ": ");
	            int idade = teclado.nextInt();
	            teclado.nextLine(); 
	           
	            if (idade < idadeMaisNova) {
	                idadeMaisNova = idade;
	                nomeMaisNova = nome;
	            }
	        }

	        System.out.println("A pessoa mais nova �: " + nomeMaisNova + ", com " + idadeMaisNova + " anos.");

	        teclado.close();
		
	}

}
