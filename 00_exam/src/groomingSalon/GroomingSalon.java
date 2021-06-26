package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
	private List<Pet> data;
	private int capacity;

	public GroomingSalon(int capacity) {

		this.data = new ArrayList<Pet>();
		this.capacity = capacity;
	}

	public void add(Pet pet) {
		if (capacity > 0) {
			capacity--;
			this.data.add(pet);
		}
	}

	public boolean remove(String name) {
		Pet pet = new Pet("Mqu", 10, "Mqu");

		for (Pet petData : data) {
			if (petData.getName().equals(name)) {
				pet = petData;
				break;
			}
		}
		return this.data.remove(pet);
	}

	public Pet getPet(String name, String owner) {
		Pet pet = null;
		for (Pet petData : data) {
			if (petData.getName().equals(name) && petData.getOwner().equals(owner)) {
				pet = petData;
				break;
			}
		}
		return pet;
	}

	public int getCount() {
		return data.size();
	}
	
	public String getStatistics() {
		StringBuilder sb = new StringBuilder();
		sb.append("The grooming salon has the following clients:").append(System.lineSeparator());
		for (Pet petData : data) {
			sb.append(petData.getName()).append(" ").append(petData.getOwner()).append(System.lineSeparator());
		}
		return sb.toString();
	}
}
