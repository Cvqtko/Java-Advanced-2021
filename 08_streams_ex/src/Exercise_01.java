import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Exercise_01 {
	public static void main(String[] args) {
		Path path = Path.of("C:\\Users\\Cvqtko\\git\\Java-Advanced-2021\\08_streams_ex\\src\\resources\\input.txt");
		try {
			Files.readAllLines(path).stream().forEach(line -> {
				int sum = 0;
				for (char symbol : line.toCharArray()) {
					sum += symbol;
				}
				System.out.println(sum);
			});
		} catch (IOException e) {
			System.out.println("Error while reading file");
		}
		
	}
}
