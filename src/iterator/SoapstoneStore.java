package iterator;
import java.util.*;
public class SoapstoneStore implements DrinkCoaster{
	List<DrinkCoasterItem> coasterItems;
	
	public SoapstoneStore(  ) {
		coasterItems = new ArrayList<DrinkCoasterItem>();
		addItem("Lahome Marble pattern Coasters","Have Strong water absorbtion, and drain stains quickly keeping the table dry", 12.99);
		addItem("ThirstyStone Brand ","Using these coasters you can keep your kitchen, dinning room and coffee tables dry", 18.29);
		addItem("GoCraft","These are a great gift for weedings anniversarys and housewarming", 20);
		addItem("HashCart","Perfect for coffee cups, beer mug and wine glasses", 10.39);
	}
	private void addItem(String name, String description, double price) {
		DrinkCoasterItem coasterItem = new DrinkCoasterItem(name, description, price);
		coasterItems.add(coasterItem);
	}
	public Iterator createIterator() {
		return new SoapstoneStoreIterator(coasterItems);
	}
	public String toString() {
		return "Soapstone Coasters";
	}
}
