package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2024");
		Curso curso3 = new Curso("React Native");
		
		curso1.adicionaAluno(aluno1);
		curso1.adicionaAluno(aluno2);
		
		curso2.adicionaAluno(aluno1);
		curso2.adicionaAluno(aluno3);
		
		aluno1.adicionaCurso(curso3);
		aluno1.adicionaCurso(curso3);
		
		for(Aluno aluno: curso3.aluno) {
			System.out.println("Estou matriculado no curso " + curso3.nome + "...");
			System.out.println("... e o meu é " + aluno.nome);
			System.out.println();
		}
		
		 System.out.println(aluno1.curso.get(0).aluno);
		
	}
}
