package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.dia = 9;
		d1.mes = 6;
		d1.ano = 2009;
		
		System.out.println(d1.obterDataFormatada());
		
		var d2 = new Data();
		d2.dia = 10;
		d2.mes = 7;
		d2.ano = 2010;
		
		d2.imprimirDataFormatada();
		
		var d3 = new Data(9, 2, 2022);
		System.out.println(d3.obterDataFormatada());
		
		var d4 = new Data();
		System.out.println(d4.obterDataFormatada());
	}
}
