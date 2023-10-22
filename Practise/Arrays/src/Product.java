public class Product {
	private String name;
	private double price;

	// Private constructor to prevent direct instantiation
	private Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	// Factory method to create a Product instance
	public static Product createProduct(String name, double price) {
		if (name != null && price >= 0) {
			return new Product(name, price);
		} else {
			throw new IllegalArgumentException("Invalid product information");
		}
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public static void main(String[] args) {
		// Create Product instances using the factory method
		Product product1 = Product.createProduct("S", 999.99);
		Product product2 = Product.createProduct("Phone", 499.99);

		// Access product information
		System.out.println("Product 1: " + product1.getName() + " - $" + product1.getPrice());
		System.out.println("Product 2: " + product2.getName() + " - $" + product2.getPrice());
	}
}
