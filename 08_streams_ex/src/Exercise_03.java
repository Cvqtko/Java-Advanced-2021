import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Exercise_03 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\Users\\Cvqtko\\git\\Java-Advanced-2021\\08_streams_ex\\src\\resources\\input.txt");
		List<String> lines = new ArrayList<String>();
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		try {
			int sum = 0;
			lines = Files.readAllLines(path);

			for (String line : lines) {

				writer.write(line.toUpperCase());
				writer.newLine();

			}

		} catch (IOException e) {
			System.out.println("Error while reading file");
		} finally {
			writer.close();
		}
	}
}
