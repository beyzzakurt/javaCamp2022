package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		//Product product = new Product(1, "Laptop", "Asus Laptop", 3000, 2, "black");
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());

		//SOLID
		//S: single responsibility principle(tek sorumluluk prensibi)
		//Bir class sadece bir iş yapar. 
		//Bir method sadece bir iş yapar. 
		//Bir if bloğu sadece bir iş yapar. 
		// Bu yüzden Product classı hem özellik tutup hem de operasyonları içermemeli.
		// Bunları birbirinden ayırmalıyız.
		
	}

}
