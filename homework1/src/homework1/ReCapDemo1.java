package homework1;

public class ReCapDemo1 {

	public static void main(String[] args) {
		int number1 = 266;
		int number2 = 25;
		int number3 = 2;
		int biggest = number1;
		
		if(biggest < number2) {
			biggest = number2;
		}
		else if(biggest < number3) {
			biggest = number3;
		}
		System.out.println("The biggest number is " + biggest);

	}

}
