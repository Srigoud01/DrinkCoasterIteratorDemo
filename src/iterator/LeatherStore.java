package iterator;

public class LeatherStore implements DrinkCoaster {
	DrinkCoasterItem[] drinkCoasterItems;
	int length = 0;
	static final int MAX_ITEMS = 5;
	public LeatherStore( ) {
		drinkCoasterItems = new DrinkCoasterItem[MAX_ITEMS];
		addItem("Alta Andina Magnetic Leather ", "The magnetic coasters stay orgnised as they have a magnet hidden underneath, they are unique for housewarming gift", 39.99);
		addItem("Lamoti Leather Coasters", "Ready to use for swimming pool, in-house parties or social events", 11.98);
		addItem("Alta andina round Leather Coaster", "These coasters protect the home from furniture water damage", 26.99);
	}
	private void addItem(String name, String description, double price) {
		if(length>=drinkCoasterItems.length) {
			System.out.println("Error cannot add more coasters to the collection");
		}else {
			DrinkCoasterItem drinkCoaster = new DrinkCoasterItem(name, description, price);
			drinkCoasterItems[length] = drinkCoaster;
			length = length + 1;
			
		}
		
	}
	public DrinkCoasterItem[] getCoasters() {
		return drinkCoasterItems;
	}
	public Iterator createIterator() {
		return new LeatherCoasterIterator(drinkCoasterItems);
	}
	public String toString() {
		
		return "Leather Coasters";
	}
}
