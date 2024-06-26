package Exercicio;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

        int quantidadeNumeros = 20;
        int nentre0e100 = 0;

        System.out.println("Digite " + quantidadeNumeros + " n�meros:");

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("N�mero " + i + ": ");
            int numero = teclado.nextInt();

            if (numero >= 0 && numero <= 100) {
               nentre0e100++;
            }
        }

        System.out.println("Quantidade de n�meros entre 0 e 100: " + nentre0e100);

        teclado.close();
		
	}

}
