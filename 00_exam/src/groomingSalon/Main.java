package groomingSalon;

public class Main {

    public static void main(String[] args) {
    	GroomingSalon salon = new GroomingSalon(20);
    	Pet dog = new Pet("Ellias", 5, "Tim");
    	System.out.println(dog); // Ellias 5 - (Tim)
    	salon.add(dog);
    	
    	System.out.println(salon.remove("Ellias")); // true
    	System.out.println(salon.remove("Pufa")); // false
    	
    	Pet cat = new Pet("Bella", 2, "Mia");
    	Pet bunny = new Pet("Zak", 4, "Jon");

    	salon.add(cat);
    	salon.add(bunny);

    	// Get Pet
    	Pet pet = salon.getPet("Bella", "Mia");
    	System.out.println(pet); // Bella 2 - (Mia)

    	// Count
    	System.out.println(salon.getCount()); // 2

    	// Get Statistics
    	System.out.println(salon.getStatistics());

    }
}
