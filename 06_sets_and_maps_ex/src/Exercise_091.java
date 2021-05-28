import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercise_091 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		StringBuilder str = new StringBuilder();
		TreeMap<String, Map<String, Integer>> users = new TreeMap<>();
		while (!"end".equals(line)) {
			String ip = line.substring(line.indexOf("=") + 1, line.indexOf(" "));
			String user = line.substring(line.indexOf("user=") + 5);
			if (users.containsKey(user)) {
				Map<String, Integer> userIps = users.get(user);
				if (userIps.containsKey(ip)) {
					userIps.put(ip, userIps.get(ip) + 1);
				} else {
					userIps.put(ip, 1);
				}
				users.put(user, userIps);
			} else {
				Map<String, Integer> ips = new LinkedHashMap<>();
				ips.put(ip, 1);
				users.put(user, ips);
			}
			line = scanner.nextLine();
		}
		for (String user : users.keySet()) {
			str.append(user + ":").append(System.lineSeparator());
			Map<String, Integer> userIps = users.get(user);

			Iterator<Map.Entry<String, Integer>> itr = userIps.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<String, Integer> entry = itr.next();
				if (itr.hasNext()) {
					str.append(entry.getKey() + " => " + entry.getValue() + ", ");
				} else {
					str.append(entry.getKey() + " => " + entry.getValue() + ".").append(System.lineSeparator());
				}
			}

		}
		System.out.println(str.toString());
	}
}