import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Exercise_02 {

	public static void main(String[] args) {
		Path path = Path.of("C:\\Users\\Cvqtko\\git\\Java-Advanced-2021\\08_streams_ex\\src\\resources\\input.txt");
		try {
			int sum = 0;
			List<String> lines = Files.readAllLines(path);
			for (String line : lines) {
				for (char symbol : line.toCharArray()) {
					sum += symbol;
				}
			}
			System.out.println(sum);

		} catch (IOException e) {
			System.out.println("Error while reading file");
		}

	}
}
