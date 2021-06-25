package Test;

public class Main {
	public static void main(String[] args) {
		DynamicList shoppingList = new DynamicList();
		shoppingList.add(7);
		shoppingList.add(-50);
		shoppingList.add(3);
		shoppingList.add(3);
		shoppingList.remove(3);

		shoppingList.remove(7);
		shoppingList.add(20);
		System.out.println("We need to buy:");
		for (int i = 0; i < shoppingList.getSize(); i++) {
			System.out.print(shoppingList.elementAt(i) + " ");
		}
		
	}
}