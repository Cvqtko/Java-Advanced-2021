import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Exercise_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Set<String>> usersAndIP = new TreeMap<>();
		Map<String, Integer> countRepeatIP = new LinkedHashMap<>();

		String input;
		while (!"end".equals(input = sc.nextLine())) {
			String[] toArray = input.split("=");
			String[] IpLooking = toArray[1].split("\\s+");

			String IP = IpLooking[0];
			String userName = toArray[3];

			usersAndIP.putIfAbsent(userName, new LinkedHashSet<>());

			usersAndIP.get(userName).add(IP);
			countRepeatIP.putIfAbsent(IP, 0);
			countRepeatIP.put(IP, countRepeatIP.get(IP) + 1);
		}
		for (Map.Entry<String, Set<String>> entry : usersAndIP.entrySet()) {
			String user = entry.getKey();
			System.out.println(user + ": ");

			Object[] SetToArray = entry.getValue().toArray(); // convert Set to Array
			for (int i = 0; i < SetToArray.length; i++) {
				if (i < SetToArray.length - 1) {
					System.out.print(SetToArray[i] + " => " + countRepeatIP.get(SetToArray[i]) + ", ");
				} else {
					System.out.print(SetToArray[i] + " => " + countRepeatIP.get(SetToArray[i]) + ".");
				}
			}
			System.out.println();

		}

	}
}