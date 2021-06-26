package task_01;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] tasksArr = scanner.nextLine().split("[, ]+");
		String[] threds = scanner.nextLine().split("\\s+");
		ArrayDeque<Integer> tasksStack = new ArrayDeque<>();
		ArrayDeque<Integer> threadQueue = new ArrayDeque<>();
		for (String element : tasksArr) {
			tasksStack.push(Integer.parseInt(element));
		}

		for (String element : threds) {
			threadQueue.offer(Integer.parseInt(element));
		}
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
