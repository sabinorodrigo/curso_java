package math;

public class CalcTest {

	public static void main(String[] args) {
		
		Calc sum = new Calc();
		sum.number1 = 5;
		sum.number2 = 5;
		
		System.out.println(sum.sumValue());
		
		Calc multiply = new Calc();
		multiply.number1 = 100;
		multiply.number2 = 10;
		
		System.out.println(multiply.multValue());
		
		Calc subtract = new Calc();
		subtract.number1 = 1000;
		subtract.number2 = 900;
		
		System.out.println(subtract.subtValue());
		
		Calc divide = new Calc();
		divide.number1 = 1000;
		divide.number2 = 100;
		
		System.out.println(divide.dividValue());
	}
}
