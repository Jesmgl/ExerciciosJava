package Exercicio;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		

		Scanner teclado = new Scanner(System.in);

        int somaIdades = 0;

        System.out.println("Digite as idades de 20 pessoas:");

        for (int i = 1; i <= 20; i++) {
            System.out.print("Idade da pessoa " + i + ": ");
            int idade = teclado.nextInt();
            somaIdades += idade;
        }

        System.out.println("A soma das idades das 20 pessoas �: " + somaIdades);

        teclado.close();
		
		
		
		
	}

}
