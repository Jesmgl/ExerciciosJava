package Exercicio;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);


        System.out.print("Digite a cota��o do d�lar (em reais): ");
        double cotacaoDolar = teclado.nextDouble();

 
        System.out.print("Digite a quantidade de d�lares a ser convertida: ");
        double quantidadeDolares = teclado.nextDouble();

      
        double valorEmReais = quantidadeDolares * cotacaoDolar;

    
        System.out.println("O valor de " + quantidadeDolares + " d�lares � equivalente a R$" + valorEmReais + " reais.");

        teclado.close();
	}

}
