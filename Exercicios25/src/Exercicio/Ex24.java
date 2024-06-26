package Exercicio;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		
		
		 Scanner teclado = new Scanner(System.in);

	        int soma = 0;
	        int n;

	        System.out.println("Digite uma sequ�ncia de n�meros (digite um n�mero negativo para encerrar):");

	        
	        while (true) {
	            System.out.print("Digite um n�mero: ");
	            n = teclado.nextInt();

	           
	            if (n < 0) {
	                break;
	            }

	            
	            soma += n;
	        }

	      
	        System.out.println("A soma dos n�meros �: " + soma);

	        teclado.close();

	}

}
