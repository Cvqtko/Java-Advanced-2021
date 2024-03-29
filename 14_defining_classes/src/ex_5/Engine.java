package ex_5;

public class Engine {
	// model, power, displacement and efficiency
	private String model;
	private int power;
	private int displacement;
	private String efficiency;

	public Engine(String model, int power, int displacement, String efficiency) {
		this.model = model;
		this.power = power;
		this.displacement = displacement;
		this.efficiency = efficiency;
	}

	public Engine(String model, int power, int displacement) {
		this(model, power, displacement, "n/a");
	}

	public Engine(String model, int power, String efficiency) {

		this(model, power, 0, efficiency);
	}

	public Engine(String model, int power) {
		this(model, power, 0, "n/a");
	}

	@Override
	public String toString() {
//		<EngineModel>:
//		Power: <EnginePower>
//		Displacement: <EngineDisplacement>
//		Efficiency: <EngineEfficiency>
//		Weight: <CarWeight>

		StringBuilder sb = new StringBuilder();
		sb.append(this.model).append(":").append(System.lineSeparator());
		sb.append("Power: ").append(this.power).append(System.lineSeparator());
		sb.append("Displacement: ").append(this.displacement == 0 ? "n/a" : this.displacement)
				.append(System.lineSeparator());
		sb.append("Efficiency: ").append(this.efficiency);
		return sb.toString();
	}

}
