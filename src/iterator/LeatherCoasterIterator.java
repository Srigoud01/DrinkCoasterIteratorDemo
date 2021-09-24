package iterator;

public class LeatherCoasterIterator implements Iterator{
	int length = 0;
	DrinkCoasterItem[] drinkCoasterItems;
	
	public LeatherCoasterIterator(DrinkCoasterItem[] drinkCoasterItems ) {
		this.drinkCoasterItems = drinkCoasterItems;
	}
	public boolean hasNext() {
		if(length >= drinkCoasterItems.length || drinkCoasterItems[length] == null) {
			return false;
		}
		else {
			return true;
		}
	}
	public DrinkCoasterItem next() {
		DrinkCoasterItem drinkCoasterItem = drinkCoasterItems[length];
		length = length + 1;
		return drinkCoasterItem;
	}
}
