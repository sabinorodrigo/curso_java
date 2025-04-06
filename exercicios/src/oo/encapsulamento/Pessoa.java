package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	// Getter
	public String getNome() {
		return nome;
	}

	// Setter
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	// Getter
	public String getSobrenome() {
		return sobrenome;
	}

	// Setter
	public void setSobrenome(String sobreNome) {
		this.sobrenome = sobreNome;
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome();
	}

	@Override
	public String toString() {
		
		return "Hello I'm " + getNomeCompleto() + " and I " + getIdade() + " years old.";
	}
}
