package streams.desafio;

public class Carta {

	private String nome;
	private double ataque;
	private double def;
	private String tipo;
	private String atributo;

	public Carta() {
	}

	public Carta(String nome, double ataque, double def, String tipo, String atributo) {
		this.nome = nome;
		this.ataque = ataque;
		this.def = def;
		this.tipo = tipo;
		this.atributo = atributo;
	}

	@Override
	public String toString() {
		return "\nnome: " + nome + " \nataque: " + ataque + " \ndef: " + def + " \ntipo: " + tipo + " \natributo: "
				+ atributo + "\n";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDef() {
		return def;
	}

	public void setDef(double def) {
		this.def = def;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getAtributo() {
		return atributo;
	}

	public void setAtributo(String atributo) {
		this.atributo = atributo;
	}

}
