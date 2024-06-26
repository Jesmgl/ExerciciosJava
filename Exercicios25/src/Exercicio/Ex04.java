package Exercicio;
import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C:");
        int c = scanner.nextInt();

        int[] valores = {a, b, c};
        Arrays.sort(valores);

        System.out.println("Valores em ordem decrescente:");
        for (int i = valores.length - 1; i >= 0; i--) {
            System.out.println(valores[i]);
        }
	}

}
