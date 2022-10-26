package youtubeDemo;

public class CustomerManager {

	private ICreditManager creditManager;
	private Customer customer;
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	
	public void save() {
		System.out.println("The customer has been saved.");
	}
	
	public void delete() {
		System.out.println("The customer has been deleted.");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("The credit has been gived.");
	}
	
}
