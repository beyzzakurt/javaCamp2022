package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		// Interface: Genellikle iş yapan sınıfların operasyonlarını sadece imza seviyesinde  
		// yazarak yazılımda bağımlılığı korumak adına yapılan çalışmadır.
		// interface = arayüz
		
		// Bir sınıf sadece bir sınıfı inherit edebilir.
		// Bir sınıf birden fazla interface'i implement edebilir.
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();
	}
}
