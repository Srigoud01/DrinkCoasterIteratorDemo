package iterator;
import java.util.*;
public class SoapstoneStoreIterator implements Iterator {
	List<DrinkCoasterItem> coasterItems;
	int position = 0;
	public SoapstoneStoreIterator( List<DrinkCoasterItem> coasterItems ) {
		this.coasterItems = coasterItems;
	}
	public boolean hasNext() {
		if (position >= coasterItems.size()) {
			return false;
		}
		else {
			return true;
		}
	}
	public DrinkCoasterItem next() {
		DrinkCoasterItem coasterItem = coasterItems.get(position);
		position = position + 1;
		return coasterItem;
	}
	
}
