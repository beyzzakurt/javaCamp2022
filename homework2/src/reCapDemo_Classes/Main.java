package reCapDemo_Classes;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		int sumResult = dortIslem.Sum(3,4);
		System.out.println(sumResult);

		int subtractResult = dortIslem.Subtract(25,12);
		System.out.println(subtractResult);
		
		int multiplyResult = dortIslem.Multiply(4,5);
		System.out.println(multiplyResult);
		
		int divideResult = dortIslem.Divide(10,5);
		System.out.println(divideResult);
		
		//Class'ların 2 özelliği vardır:
		//1) Ortak operasyonları tutar.
		//2) Özellik tutar.
	}

}
