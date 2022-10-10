package pratica;

import java.util.Scanner;

public class ContaCorrenteMain {

	public static void main(String[] args) {

		ContaCorrente info = new ContaCorrente();

		info.nomeTitular = "Ash";
		info.cpf = 01234567l;
		info.numeroConta = 123432l;
		info.saldo = 10000.00;
		
		info.mostrarDados();
		
		info.depositar(100.00);
		info.sacar(30.00);
		
		System.out.println("----------Novo Saldo----------");
		info.mostrarDados();
		
	}

}
