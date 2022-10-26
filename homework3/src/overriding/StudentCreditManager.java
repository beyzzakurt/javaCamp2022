package overriding;

public class StudentCreditManager extends BaseCreditManager{

	public double calculate (double tutar) {
		return tutar*1.10;
	}
}
