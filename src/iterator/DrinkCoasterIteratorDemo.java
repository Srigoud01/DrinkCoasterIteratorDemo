package iterator;

public class DrinkCoasterIteratorDemo {

	public static void main(String[] args) {
		DrinkCoaster soapstoneCoaster = new SoapstoneStore();
		DrinkCoaster leatherCoaster = new LeatherStore();
		
		BarMaid barMaid = new BarMaid(soapstoneCoaster, leatherCoaster);
		
		barMaid.printCoasters();

	}

}
