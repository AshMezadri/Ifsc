package ex6;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		Integer[] valores = new Integer[10];
		Integer maior = -99999999, menor = 99999999;

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			Integer num = Integer.valueOf(leitura.nextLine());
			valores[i] = num;

			if (valores[i] > maior) {
				maior = valores[i];
			}
			if (valores[i] < menor) {
				menor = valores[i];
			}

		}

		System.out.println("Maior valor = " + (maior));
		System.out.println("Menor valor = " + (menor));

	}

}
