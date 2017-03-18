//Ryan Nguyen

public class SearchBar
{
	private Object[] items = new Object[5];
	private int size = 0;
	public Object retrieveItem(int index){
		if (index >= 0 && index < size)
			return items[index];
		else
			throw new ArrayIndexOutOfBoundsException();
	
	}
	public void addItem(Object item){
		for (int i =0; i < items.length;i++){
			items[i] = item;
		}
	}
	public Object printList(){
		return items;
		}
		
	public static void main(String[] args){
		SearchBar newList = new SearchBar();
		newList.addItem("manicure");
		newList.addItem("Pedicure");
		newList.printList();
	}
}