package Exercicio;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do salário mínimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o valor do seu salário:");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;
        System.out.println("Você ganha " + quantidadeSalarios + " salários mínimos.");

	}

}
