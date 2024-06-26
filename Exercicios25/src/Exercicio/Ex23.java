package Exercicio;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// 23- Fa�a um programa que leia 20 n�meros e, ao final, escreva quantos est�o entre 0 e 100, quantos est�o entre 101 e 200 e quantos s�o maiores de 200
		
		Scanner teclado = new Scanner(System.in);

        int quantidade = 20;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;

        
        System.out.println("Digite " + quantidade + " n�meros:");

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("N�mero " + i + ": ");
            int numero = teclado.nextInt();

          
            if (numero >= 0 && numero <= 100) {
                contador1++;
            } else if (numero >= 101 && numero <= 200) {
                contador2++;
            } else if (numero > 200) {
                contador3++;
            }
        }

        System.out.println("Quantidade de n�meros entre 0 e 100: " + contador1);
        System.out.println("Quantidade de n�meros entre 101 e 200: " + contador2);
        System.out.println("Quantidade de n�meros maiores que 200: " + contador3);

        teclado.close();

	}

}
