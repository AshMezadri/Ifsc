package pratica;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		ArrayList<Gato> listaGato = new ArrayList<>();

		Gato gato1 = new Gato();

		gato1.setComprimento(46f);
		gato1.setCor("branco");
		gato1.setEcossistema("casa");
		gato1.setNome("frida");
		gato1.setNumeroPatas(4);
		gato1.setRaca("angora");

		listaGato.add(gato1);

		Gato gato2 = new Gato();

		gato2.setComprimento(35.6f);
		gato2.setCor("preto");
		gato2.setEcossistema("sitio");
		gato2.setNome("gato");
		gato2.setNumeroPatas(3);
		gato2.setRaca("mumbai");

		listaGato.add(gato2);

		Gato gato3 = new Gato();

		gato3.setComprimento(50f);
		gato3.setCor("duas cores");
		gato3.setEcossistema("apartamento");
		gato3.setNome("oreo");
		gato3.setNumeroPatas(4);
		gato3.setRaca("siames");

		listaGato.add(gato3);

		int i = 1;

		for (Gato gato : listaGato) {
			System.out.println("====================================================");
			System.out.println("Gato numero " + i);
			System.out.println("Nome : " + gato.getNome());
			System.out.println("Raca : " + gato.getRaca());
			System.out.println("Cor : " + gato.getCor());
			System.out.println("Ecossistema : " + gato.getEcossistema());
			System.out.println("Comprimento : " + gato.getComprimento());
			System.out.println("Numero de patas : " + gato.getNumeroPatas());
			i++;
		}

		ArrayList<Cachorro> listaCachorro = new ArrayList<>();

		Cachorro cachorro1 = new Cachorro();

		cachorro1.setComprimento(31f);
		cachorro1.setCor("marromzinho");
		cachorro1.setEcossistema("apto");
		cachorro1.setNome("tanque");
		cachorro1.setNumeroPatas(4);
		cachorro1.setRaca("buldogue");

		listaCachorro.add(cachorro1);

		Cachorro cachorro2 = new Cachorro();

		cachorro2.setComprimento(60f);
		cachorro2.setCor("preto");
		cachorro2.setEcossistema("casa");
		cachorro2.setNome("poti");
		cachorro2.setNumeroPatas(3);
		cachorro2.setRaca("rottwiler");

		listaCachorro.add(cachorro2);

		Cachorro cachorro3 = new Cachorro();

		cachorro3.setComprimento(50f);
		cachorro3.setCor("preto e branco");
		cachorro3.setEcossistema("sitio");
		cachorro3.setNome("doggi");
		cachorro3.setNumeroPatas(4);
		cachorro3.setRaca("border collie");

		listaCachorro.add(cachorro3);

		int j=1;
		
		for (Cachorro cachorro : listaCachorro) {
			System.out.println("====================================================");
			System.out.println("Cachorro numero " + j);
			System.out.println("Nome : " + cachorro.getNome());
			System.out.println("Raca : " + cachorro.getRaca());
			System.out.println("Cor : " + cachorro.getCor());
			System.out.println("Ecossistema : " + cachorro.getEcossistema());
			System.out.println("Comprimento : " + cachorro.getComprimento());
			System.out.println("Numero de patas : " + cachorro.getNumeroPatas());
			j++;

		}

	}

}
