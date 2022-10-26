package homework1;

public class SwitchDemo {

	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
			case 'A':
				System.out.println("Perfect: You passed the examination.");
				break;
			case 'B':
				System.out.println("Very good: You passed the examination.");
				break;
			case 'C':
				System.out.println("Good: You passed the examination.");
				break;
			case 'D':
				System.out.println("Not bad: You passed the examination.");
				break;
			case 'F':
				System.out.println("Unfortunately, you failed the exam.");
				break;
				default:
					System.out.println("invalid note");
		}

	}

}
