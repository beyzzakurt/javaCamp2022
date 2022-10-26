package staticDemo;

public class ProductValidator {

	static {
		System.out.println("The static constructive block worked.");
	}
	
	public ProductValidator( ) {
		System.out.println("The constructive block worked.");
	}
	
	public static boolean isValid(Product product) {
		
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
			
	}
	// static: uygulamaların içinde utility dediğimiz araç yazarken kullanırız.
	// Bir ürünü kaydederken, güncellerken ürünün kurallara uygun olup olmadığını bulmak için kullanılır. 
	
	// "static" ifadesi bu nesnenin örneğini oluşturuyor.
	// Fakat bu static olarak bir kere oluşuyor. 
	// Bütün kullanıcılar onu bu şekilde kullanır.
	// Çok yaygın bir kullanım değil.
	
	// Static oluşturduğumuzda uygulama sıfırlanana kadar kadar bellekten atılmaz.
	// İlk çağıran kullanıcı nesneyi oluşturuyor. 
	// Diğer bütün kullanıcılar aynı nesneyi kullanıyor.
	
	// Bir method'u static yaptığımızda class ismiyle direkt çağrılır.

	// Ana class'a static veremeyiz.
	// inner class: Bir class'ın içinde başka bir class.
}
