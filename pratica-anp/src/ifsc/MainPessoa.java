package ifsc;

public class MainPessoa {

	public static void main(String[] args) {
		
		Professor infoProfessor = new Professor();
		
		infoProfessor.setNome("Bruna");
		infoProfessor.setCpf("xxxxxxxxx-xx");
		infoProfessor.setSiape(01234567);

		Aluno infoAluno = new Aluno();
		
		infoAluno.setNome("Ash");
		infoAluno.setCpf("iiiiiiiii-ii");
		infoAluno.setMatricula(7654321);
		
		System.out.println("-------------- Infos do Professor --------------");
		System.out.println(infoProfessor.getNome());
		System.out.println(infoProfessor.getCpf());
		System.out.println(infoProfessor.getSiape());
		
		System.out.println("-------------- Infos do Aluno --------------");
		System.out.println(infoAluno.getNome());
		System.out.println(infoAluno.getCpf());
		System.out.println(infoAluno.getMatricula());
	}

}
