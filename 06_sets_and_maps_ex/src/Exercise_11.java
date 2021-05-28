import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
 
		int n = Integer.parseInt(scanner.nextLine());
 
		TreeMap<String, TreeMap<String, Integer>> users = new TreeMap<>();
 
		for (int i = 0; i < n; i++) {
			String[] userInput = scanner.nextLine().split(" ");
			String ip = userInput[0];
			String user = userInput[1];
			int minutes = Integer.parseInt(userInput[2]);
 
			if (!users.containsKey(user)) {
				users.put(user, new TreeMap<>());
			}
 
			TreeMap<String, Integer> ipSession = users.get(user);
			int newMinutes = 0;
			if (ipSession.containsKey(ip)) {
				newMinutes = ipSession.get(ip);
			}
			ipSession.put(ip, newMinutes + minutes);
		}
		for (String user : users.keySet()) {
			System.out.print(user+": ");
			int totalMin = 0;
			for (String ip : users.get(user).keySet()) {
				totalMin += users.get(user).get(ip);
			}
 
			System.out.print(totalMin +" ");
			System.out.print(users.get(user).keySet());
			System.out.println();
		}
	}
}