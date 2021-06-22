package ex_03;

import java.util.Scanner;

import ex_03.Box;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		Box<String> box = new Box<String>();
		
		while(n-->0) {
			String line = scanner.nextLine();
			box.add(line);
			
		}
		
		String[] indexes = scanner.nextLine().split("\\s+");
		int swapIndex1 = Integer.parseInt(indexes[0]);
		int swapIndex2 = Integer.parseInt(indexes[1]);
		
		box.swap(swapIndex1, swapIndex2);
		System.out.println(box.toString());
	}

}
