import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise_09 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
        String[] input = scan.nextLine().split(" ");
        ArrayDeque<String> operators = new ArrayDeque<>();
        ArrayDeque<String> expression = new ArrayDeque<>();
        Map<String,Integer> priorites = new HashMap<>();
        priorites.put("*", 3);
        priorites.put("/", 3);
        priorites.put("+", 2);
        priorites.put("-", 2);
        priorites.put("(", 1);

        for (String current : input) {
            try {
                double num = Double.parseDouble(current);
                expression.addLast(current);
            } catch (Exception e) {
                switch (current) {
                    case "x":
                        expression.addLast(current);
                        break;
                    case "(":
                        operators.push(current);
                        break;
                    case ")":
                        String symbol = operators.pop();
                        while (!symbol.equals("(")) {
                            expression.addLast(symbol);
                            symbol = operators.pop();
                        }
                        break;
                    default:
                        while (!operators.isEmpty() && priorites.get(operators.peek()) >= priorites.get(current)) {
                            expression.addLast(operators.pop());
                        }
                        operators.push(current);
                        break;
                }
            }
        }
        while (!operators.isEmpty()) {
            expression.addLast(operators.pop());
        }

        while (expression.size() > 0) {
            System.out.print(expression.pop()+" ");
        }
    }
}