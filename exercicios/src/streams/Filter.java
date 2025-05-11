package streams;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		
		Aluno bilbo = new Aluno("Bilbo", 8.7);
		Aluno gandalf = new Aluno("Gandalf", 7.8);
		Aluno balin = new Aluno("Balin", 6.5);
		Aluno thorin = new Aluno("Thorin", 9.6);
		Aluno golum = new Aluno("Golum", 4.3);
		Aluno beorn = new Aluno("Beorn", 10.0);
		
		List<Aluno> alunos = Arrays.asList(bilbo, gandalf, balin, thorin, golum, beorn);
		
		alunos.stream()
		.filter(a -> a.nota >= 7)
		.map(a -> "Parabéns " + a.nome + "! Você foi aprovado!")
		.forEach(System.out::println);
	}
}
