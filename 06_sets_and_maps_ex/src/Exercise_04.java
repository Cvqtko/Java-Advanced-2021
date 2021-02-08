import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		TreeMap<Character, Integer> symbols = new TreeMap<>();
		
		String text = scanner.nextLine();
		
		for (int i = 0; i < text.length(); i++) {
			char currentSymbol = text.charAt(i);
			
			if(!symbols.containsKey(currentSymbol)) {
				symbols.put(currentSymbol, 1);
			}else {
				int currentCount = symbols.get(currentSymbol);
				symbols.put(currentSymbol, ++currentCount);
			}
		}
		for(Entry<Character, Integer> entry : symbols.entrySet()) {
			System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());
		}
	}
}
