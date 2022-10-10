package pratica;

public class ContaCorrente {

	public String nomeTitular;
	public Long cpf;
	public Long numeroConta;
	public Double saldo;

	public Double sacar(double saque) {

		double retornoSaque = 0;
		if (saque > saldo) {
			System.out.println("Saldo insuficiente");
		} else {
			saldo = saldo - saque;
			retornoSaque = saque;
		}

		return retornoSaque;
	}

	public void depositar(double deposito) {

		saldo = saldo + deposito;

	}

	public void mostrarDados() {
		System.out.println("Nome do titular: " + nomeTitular);
		System.out.println("CPF: " + cpf);
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Saldo: " + saldo);
	}

}
