import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] children = scanner.nextLine().split("\\s+");
		int n = Integer.valueOf(scanner.nextLine());

		ArrayDeque<String> queue = new ArrayDeque<>();
		int iteration = 0;
		for (String child : children)
			queue.offer(child);
		while (queue.size() > 1) {
			for (int i = 1; i < n; i++) {

				queue.offer(queue.poll());
			}
			iteration++;
			if (!checkIfPrime(iteration)) {
				System.out.println("Removed " + queue.poll());
			} else {
				System.out.println("Prime " + queue.peek());
			}
		}

		System.out.println("Last is " + queue.poll());

	}

	public static boolean checkIfPrime(int number) {
		int i, m = 0, flag = 0;
		int n = number;// it is the number to be checked
		m = n / 2;
		if (n == 0 || n == 1) {
			return false;
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					flag = 1;
					return false;
				}
			}
		}
		return true;
	}
}
