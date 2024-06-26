package Exercicio;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade:");
        int idade = scanner.nextInt();

        if (idade < 16) {
            System.out.println("Não eleitor.");
        } else if (idade >= 18 && idade < 65) {
            System.out.println("Eleitor obrigatório.");
        } else {
            System.out.println("Eleitor facultativo.");

	}
	}

}
