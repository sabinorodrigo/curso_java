package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Celtic Guardian");
		Aluno aluno2 = new Aluno("Bilbo Bolseiro");
		Aluno aluno3 = new Aluno("Harry Bosch");
		
		Curso curso1 = new Curso("Como ser um detetive");
		Curso curso2 = new Curso("Como ser um gatuno");
		Curso curso3 = new Curso("Como manejar uma espada");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno2.adidicionarCurso(curso3);
		aluno3.adidicionarCurso(curso3);
		
		System.out.println("Curso #1");
		for (Aluno aluno : curso1.alunos) {
			System.out.println("Estou matrículado no curso " + curso1.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		System.out.println("_____________________");
		
		System.out.println("Curso #2");
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Estou matrículado no curso " + curso2.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		System.out.println("_____________________");
		
		System.out.println("Curso #3");
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou matrículado no curso " + curso3.nome + "...");
			System.out.println("...e o meu nome é " + aluno.nome);
			System.out.println();
		}
		System.out.println("_____________________");
		
		System.out.println(aluno1.cursos.get(0).alunos);
		System.out.println();
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("como ser um gatuno");
		if (cursoEncontrado != null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}
	}	
}
