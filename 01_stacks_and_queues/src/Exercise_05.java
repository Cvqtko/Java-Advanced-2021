import java.util.ArrayDeque;
import java.util.Scanner;

public class Exercise_05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String task = scanner.nextLine();

		ArrayDeque<String> printer = new ArrayDeque<>();
		
		while(!"print".equals(task)) {
			if(task.equals("cancel")) {
				if(printer.isEmpty()) {
					System.out.println("Printer is on standby");
				}else {
					System.out.println("Canceled " + printer.poll());
				}
			}else {
				printer.offer(task);
			}
			
			task = scanner.nextLine();
		}
		while(!printer.isEmpty()) {
			System.out.println(printer.poll());
		}
	}
}
