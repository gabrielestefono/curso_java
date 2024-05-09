package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void totalValueInStock(int quantity) {
		this.quantity = this.quantity + quantity;
	}

	public void removeProduct(int quantity) {
		this.quantity = this.quantity - quantity;
	}
}
