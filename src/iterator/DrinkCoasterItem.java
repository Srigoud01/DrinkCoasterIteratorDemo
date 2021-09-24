package iterator;

public class DrinkCoasterItem {
	String name;
	String description;
	double price;
	public DrinkCoasterItem(String name , String description , double price ) {
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String toString() {
		return (name + ", " + description + ", " + price);
	}
}
