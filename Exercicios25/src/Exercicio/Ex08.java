package Exercicio;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a porcentagem do IPI:");
        double ipi = scanner.nextDouble();

        System.out.println("Digite o c�digo da pe�a 1:");
        int codigo1 = scanner.nextInt();
        System.out.println("Digite o valor unit�rio da pe�a 1:");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite a quantidade de pe�as 1:");
        int quantidade1 = scanner.nextInt();

        System.out.println("Digite o c�digo da pe�a 2:");
        int codigo2 = scanner.nextInt();
        System.out.println("Digite o valor unit�rio da pe�a 2:");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite a quantidade de pe�as 2:");
        int quantidade2 = scanner.nextInt();

        double total = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);
        System.out.println("Valor total a ser pago: " + total);

	}

}
