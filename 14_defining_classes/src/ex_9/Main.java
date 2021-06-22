package ex_9;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String lane = scanner.nextLine();

		HashMap<String, Cat> cats = new HashMap<>();

		while (!lane.equals("End")) {
			String[] tokens = lane.split("\\s+");
			String breed = tokens[0];
			String name = tokens[1];
			double specification = Double.parseDouble(tokens[2]);
			Cat cat = null;

			switch (breed) {
			case "Siamese":
				cat = new Siamese(name, specification);
				break;
			case "Cymric":
				cat = new Cymric(name, specification);
				break;
			case "StreetExtraordinaire":
				cat = new StreetExtraordinaire(name, specification);
				break;
			}

			cats.put(name, cat);


			lane = scanner.nextLine();
		}

		String theCatsName = scanner.nextLine();

		System.out.println(cats.get(theCatsName));

	}
}