package youtubeDemo;

public class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("The military credit has been calculated.");
	}

	// "save" operasyonuna gerek kalmadı.
}
