package Exercicio;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		

	
		Scanner teclado = new Scanner(System.in);

        int quantidadeNumeros = 20;
        int contadorMaioresQueOito = 0;

        
        System.out.println("Digite " + quantidadeNumeros + " n�meros:");

        for (int i = 1; i <= quantidadeNumeros; i++) {
            System.out.print("N�mero " + i + ": ");
            int numero = teclado.nextInt();

         
            if (numero > 8) {
                contadorMaioresQueOito++;
            }
        }

      
        System.out.println("Quantidade de n�meros maiores que 8: " + contadorMaioresQueOito);

        teclado.close();
	
	
	
	}

}
