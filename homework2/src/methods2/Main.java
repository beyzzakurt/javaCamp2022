package methods2;

public class Main {

	public static void main(String[] args) {
		String message = "Today, the weather is very nice";
		String newMessage = sehirVer();
		System.out.println(newMessage);
		
		int number = sum(5,7);
		System.out.println(number);
		
		int toplam = sum2(2,3,4,5,6,10);
		System.out.println(toplam);
	}
	
	public static void add() {
		System.out.println("Has been added.");
	}
	
	public static void delete() {
		System.out.println("Has been deleted.");
	}
	
	public static void update() {
		System.out.println("Has been updated.");
	}
	
	public static int sum (int number1, int number2) {
		return number1 + number2;
	}
	
	public static int sum2 (int... numbers) {
		int toplam = 0;
		for (int number: numbers) {
			toplam += number; 
		}
		
		return toplam;
	}
			
	public static String sehirVer() {
		return "Ankara";
	}
}
