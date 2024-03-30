package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 4;
		d1.ano = 1988;
		
		System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);
		
		System.out.println();

		var d2 = new Data();
		d2.dia = 9;
		d2.mes = 9;
		d2.ano = 1956;
		
		System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		
	}
	
}
