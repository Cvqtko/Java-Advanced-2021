import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt(scanner.nextLine());
		Map<String,Map<String,List<String>>> data = new LinkedHashMap<>();
		while(n-->0) {
			String[] tokens = scanner.nextLine().split("\\s+");
			
			String continent = tokens[0];
			String country = tokens[1];
			String city = tokens[2];
			
			data.putIfAbsent(continent, new LinkedHashMap<>());
			
			data.get(continent).putIfAbsent(country, new ArrayList<>());
			
			data.get(continent).get(country).add(city);
		}
		data.forEach((key,value)->{
			System.out.println(key+":");
			value.forEach((innerKey,innerValue)->{
				System.out.println("  " + innerKey+" -> "+String.join(", ", innerValue));
			});
		});
	}
}
