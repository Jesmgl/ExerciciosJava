package Exercicio;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        System.out.println("Digite o saldo médio:");
	        double saldoMedio = scanner.nextDouble();
	        double credito = 0;

	        if (saldoMedio >= 0 && saldoMedio <= 200) {
	            credito = 0;
	        } else if (saldoMedio <= 400) {
	            credito = saldoMedio * 0.2;
	        } else if (saldoMedio <= 600) {
	            credito = saldoMedio * 0.3;
	        } else {
	            credito = saldoMedio * 0.4;
	        }

	        System.out.println("Saldo médio: " + saldoMedio);
	        System.out.println("Crédito: " + credito);

	}

}
