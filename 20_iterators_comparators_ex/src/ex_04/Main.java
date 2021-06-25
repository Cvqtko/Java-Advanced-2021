package ex_04;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Integer> lake = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
		
		Frog frog = new Frog(lake);
		StringBuilder sb = new StringBuilder();
		while(frog.hasNext()) {
			sb.append(frog.next()+", ");
		}
		String result = sb.substring(0,sb.length()-2);
		System.out.println(result);
	}

}
