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
		TreeMap<String, Map<String, Integer>> userInfo = new TreeMap<>();
		while (!"end".equals(line)) {
			String[] tokens = line.split("\\s+");
			String ip = tokens[0].split("=")[1];
			String username = tokens[2].split("=")[1];
			userInfo.putIfAbsent(username, new LinkedHashMap<>());
			userInfo.get(username).putIfAbsent(ip, 0);
			userInfo.get(username).put(ip, userInfo.get(username).get(ip) + 1);
			line = scanner.nextLine();
		}
		for (Map.Entry<String, Map<String, Integer>> entry : userInfo.entrySet()) {
			System.out.println(entry.getKey() + ":");
			Map<String, Integer> innerMap = entry.getValue();
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<String, Integer> innerEntry : innerMap.entrySet()) {
				String ipInfo = String.format("%s => %d", innerEntry.getKey(), innerEntry.getValue());
				sb.append(ipInfo);
				sb.append(", ");
			}
			String res = sb.substring(0, sb.length() - 2) + ".";
			System.out.println(res);
		}
	}
}