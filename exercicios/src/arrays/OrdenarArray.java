package arrays;

public class OrdenarArray {

	public static void main(String[] args) {
		
		int[] number = {7, 6, 48, 13, 199, 2, 86, 59, 89 };
		
		int numbers = ordenar(number);
		
		System.out.println(numbers);
	}
	
	public static int ordenar(int[] v) {
		
		int ordena =0;
 		
		for (int i = 0; i < v.length -1; i++) {
			for (int j = i + 1; j < v.length; j++) {
				
				if (v[j] < v[i]) {
					ordena = v[j];
					v[j] = v[i];
					return v[i] = ordena;
				}
			}
		}
		return ordena;
	}
}
