package classesWithAttributes;

public class Product {

	public Product(int id, String name, String description, double price, int stockAmount, String colour) {
		System.out.println("The constructor blok worked.");
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.description = description;
		this.stockAmount = stockAmount;
	}
	
	public Product() {
		
	}
	
	// attribute | field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;
	private String code;
	
	// this-> bu class'taki demek.

	// encapsulation
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColour() {
		return colour;
	}
	public void setRenk(String colour) {
		this.colour = colour;
	}
	public String getCode() {
		return this.name.substring(0,1) + id;
	}
	
	
}
