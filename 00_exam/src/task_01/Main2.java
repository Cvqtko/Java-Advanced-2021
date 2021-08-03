package task_01;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		ArrayDeque<Integer> tasksStack = Arrays.stream(scanner.nextLine().split("[, ]+")).mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toCollection(ArrayDeque::new));

		ArrayDeque<Integer> threadQueue = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
				.boxed().collect(Collectors.toCollection(ArrayDeque::new));

		int taskToKill = Integer.parseInt(scanner.nextLine());

		while (!threadQueue.isEmpty() || !tasksStack.isEmpty()) {
			int currentTask = tasksStack.peek();
			int currentThread = threadQueue.peek();
			if (currentTask == taskToKill) {
				System.out.printf("Thread with value %d killed task %d", currentThread, currentTask);
				System.out.println();
				break;
			} else if (currentThread >= currentTask) {
				tasksStack.pop();
				threadQueue.poll();
			} else {
				threadQueue.poll();
			}
		}
		while (!threadQueue.isEmpty()) {
			System.out.print(threadQueue.poll() + " ");
		}
	}
}
