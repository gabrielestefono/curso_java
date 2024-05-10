package entities;

public class Product {
	String name;
	private double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity = this.quantity - quantity;
	}

	public String toString() {
		return "Dados do Produto: "
				+ name
				+ ", R$ "
				+ String.format("%.2f", price)
				+ ", "
				+ quantity
				+ " unidades, total: R$ "
				+ totalValueInStock()
				+ "%n";
	}
}
