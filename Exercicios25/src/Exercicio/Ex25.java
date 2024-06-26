package Exercicio;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		
		
		 Scanner teclado = new Scanner(System.in);

	        int soma = 0;
	        int num;

	        System.out.println("Digite uma sequ�ncia de n�meros (digite um n�mero negativo para encerrar):");

	    
	        do {
	            System.out.print("Digite um n�mero: ");
	            num = teclado.nextInt();

	            
	            if (num >= 0) {
	                soma += num; 
	            }
	        } while (num >= 0);

	        
	        System.out.println("A soma dos n�meros �: " + soma);

	        teclado.close();
		

	}

}
