package iterator;

public class BarMaid {
	DrinkCoaster soapstoneCoaster;
	DrinkCoaster leatherCoaster;
	
	public BarMaid( DrinkCoaster soapstoneCoaster, DrinkCoaster leatherCoaster ) {
		this.soapstoneCoaster = soapstoneCoaster;
		this.leatherCoaster = leatherCoaster;
	}
	public void printCoasters() {
		Iterator soapstoneCoasterIterator = soapstoneCoaster.createIterator();
		Iterator leatherCoasterIterator = leatherCoaster.createIterator();
		System.out.println("\n-----------SoapStone Coaster---------\n");
		printCoasters(soapstoneCoasterIterator);
		System.out.println("\n---------- Leather Coaster---------\n");
		printCoasters(leatherCoasterIterator);
	}
	public void printCoasters(Iterator iterator) {
		while(iterator.hasNext()) {
			DrinkCoasterItem drinkCoasterItem = iterator.next();
			System.out.print(drinkCoasterItem.getName() + ", ");
			System.out.print(drinkCoasterItem.getDescription() + ", ");
			System.out.println(drinkCoasterItem.getPrice());
		}
	}
}
