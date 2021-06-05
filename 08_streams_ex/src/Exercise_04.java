import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise_04 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("C:\\Users\\Cvqtko\\git\\Java-Advanced-2021\\08_streams_ex\\src\\resources\\input.txt");
		List<String> lines = new ArrayList<String>();
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
		try {
			int sum = 0;
			lines = Files.readAllLines(path);

		} catch (IOException e) {
			System.out.println("Error while reading file");
		}

		Map<String, Integer> symbols = new HashMap<>();
		symbols.put("vowels", 0);
		symbols.put("consonants", 0);
		symbols.put("punctuations", 0);
		for (String line : lines) {
			for (char symbol : line.toCharArray()) {
				if (isVowel(symbol)) {
					symbols.put("vowels", symbols.get("vowels") + 1);
				} else if (isPunctoation(symbol)) {
					symbols.put("punctuations", symbols.get("punctuations") + 1);
				} else if (symbol != ' ') {
					symbols.put("consonants", symbols.get("consonants") + 1);
				}
			}

		}
		writer.write("Vowels: " + symbols.get("vowels"));
		writer.newLine();
		writer.write("Consonants: " + symbols.get("consonants"));
		writer.newLine();
		writer.write("Punctuation: " + symbols.get("punctuations"));
		writer.close();

	}

	public static boolean isVowel(char symbol) {

		String vowels = "aouei";
		return vowels.contains(symbol + "");
	}

	public static boolean isPunctoation(char symbol) {
		return symbol == '!' || symbol == ',' || symbol == '.' || symbol == '?';
	}
}
