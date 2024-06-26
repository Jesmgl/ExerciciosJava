package Exercicio;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);

   
        System.out.print("Digite o valor total da compra: ");
        double valorCompra = teclado.nextDouble();

        
        double valorPrestacao = valorCompra / 5;

       
        System.out.println("O valor de cada presta��o �: R$ " + valorPrestacao);

        teclado.close();
		
		
		

	}

}
