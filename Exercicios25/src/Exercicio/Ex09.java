package Exercicio;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do sal�rio m�nimo:");
        double salarioMinimo = scanner.nextDouble();
        System.out.println("Digite o valor do seu sal�rio:");
        double salarioUsuario = scanner.nextDouble();

        double quantidadeSalarios = salarioUsuario / salarioMinimo;
        System.out.println("Voc� ganha " + quantidadeSalarios + " sal�rios m�nimos.");

	}

}
