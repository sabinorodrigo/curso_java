package exercicios;

public class Lutador {

	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	public Lutador() {
	}

	public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitorias, int derrotas,
			int empates) {
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String aprensentar() {
		
		return String.format(
				"-----------------------------------------------"
				+ "\nCHEGOU A HORA! Apresentamos o lutador %s%n"
				+ "Diretamente de %s%n"
				+ "com %d anos e medindo %.2f%n"
				+ "pesando %.2fKg%n"
				+ "%d vitórias\n"
				+ "%d derrotas e\n"
				+ "%d empates\n"
				+ "-----------------------------------------------", 
				this.getNome(), this.getNacionalidade(), this.getIdade(), 
				this.getAltura(), this.getPeso(), this.getVitorias(), getDerrotas(), getEmpates());
	}
	
	public String status() {
		return String.format("%s é um peso %s%n"
				+ "Ganhour %d vezes\n"
				+ "Perdeu %d vezes\n"
				+ "Empatou %d vezes\n", this.getNome(), this.getCategoria(), this.getVitorias(),
				this.getDerrotas(), this.getEmpates());
	}

	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}

	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}

	public void empatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		
		if (peso <= 52.2) {
			categoria = "Invalido";
		} else if (peso <= 70.3) {
			categoria = "Leve";
		} else if (peso <= 83.9) {
			categoria = "Médio";
		} else if (peso <= 120.2) {
			categoria = "Pesado";
		} else {
			categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

}
