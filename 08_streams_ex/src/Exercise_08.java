import java.io.File;
import java.nio.file.Path;

public class Exercise_08 {
	public static void main(String[] args) {
		String path = "C:\\Users\\Cvqtko\\git\\Java-Advanced-2021\\08_streams_ex\\src\\resources\\Exercises Resources";

		File folder = new File(path);
		int size = 0;
		for (File file : folder.listFiles()) {
			size += file.length();
		}

		System.out.println("Folder size: " + size);
	}
}
