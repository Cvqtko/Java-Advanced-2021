package ex_04;
import java.util.Scanner;

import ex_04.Box;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Box<Integer> box = new Box<Integer>();
		
		while(n-->0) {
			int number = Integer.parseInt(scanner.nextLine());
			box.add(number);
			
		}
		
		String[] indexes = scanner.nextLine().split("\\s+");
		int swapIndex1 = Integer.parseInt(indexes[0]);
		int swapIndex2 = Integer.parseInt(indexes[1]);
		
		box.swap(swapIndex1, swapIndex2);
		System.out.println(box.toString());
	}

}
