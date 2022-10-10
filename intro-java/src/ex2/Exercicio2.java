package ex2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner(System.in);
		System.out.println("Informe seu nome:");
		String nome = leitura.nextLine();
		System.out.println("Informe sua idade:");
		Integer idade = Integer.valueOf(leitura.nextLine());

		System.out.println(nome);
		System.out.println(idade);
	}

}
