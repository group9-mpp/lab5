package prob4;

public class Item {
	
	private String name;
	private Item(String name) {
		this.name = name;
	} 
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public static Item newItem(String name) {
		return new Item(name);
	}
}
