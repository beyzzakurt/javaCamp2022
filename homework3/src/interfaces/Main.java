package interfaces;

public class Main {

	public static void main(String[] args) {
		
		// Polymorphism'in interface'lerle kullanım şekli.
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
		// Polymorphism'in en iyi uygulandığı yapılardan biri interface'lerdir.
		// Interface onu implement eden class'ın referansını tutabilir. (polymorphism)
		
	}
}
