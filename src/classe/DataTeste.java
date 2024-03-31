package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 4;
		d1.ano = 1988;
		
		System.out.printf("%d/%d/%d%n", d1.dia, d1.mes, d1.ano);
		System.out.println(d1.obterDataFormatada());
		
		System.out.println();

		var d2 = new Data();
		d2.dia = 9;
		d2.mes = 9;
		d2.ano = 1956;
		
		System.out.println(d2.dia + "/" + d2.mes + "/" + d2.ano);
		System.out.println(d2.obterDataFormatada());
		
		// / *********************** /
		System.out.println();
		
		Data d3 = new Data();
		
		String dataTres = d3.obterDataFormatada();
		System.out.println(dataTres);
		
		Data d4 = new Data(9, 2, 2022);
		String dataQuatro = d4.obterDataFormatada();
		System.out.println(dataQuatro);
	}
	
}
