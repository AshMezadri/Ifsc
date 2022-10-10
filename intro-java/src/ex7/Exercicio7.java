package ex7;

public class Exercicio7 {

	public static void main(String[] args) {

		String[] vetor = { "A", "S", "H", "M", "E", "Z", "A", "D", "R", "I" };

		for (int i = 0; i < 10; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("Tamanho do vetor: " +(vetor.length));
		System.out.println(vetor[vetor.length - 1]);

	}

}
