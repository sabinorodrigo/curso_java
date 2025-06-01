package arrays;

public class ArrayInt {

	public static void main(String[] args) {
		
		int[] array = new int[12];
		
		System.out.printf("%s%8s%n", "Index", "Value");
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d%8d%n", i, array[i]);
		}
	}
}
