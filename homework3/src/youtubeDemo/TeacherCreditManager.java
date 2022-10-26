package youtubeDemo;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void calculate() {
		// hesaplamalar
		System.out.println("The teacher credit has been calculated.");
	}

	// "save" operasyonuna gerek kalmadı.
}
