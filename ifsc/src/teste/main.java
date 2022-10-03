package teste;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("hello world");
		
		System.out.println("tell me your name: ");
		String nome = leitura.nextLine();
		
		System.out.println("your name is: "+nome);
	}

}
