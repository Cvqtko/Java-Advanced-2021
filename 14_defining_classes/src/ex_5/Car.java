package ex_5;

public class Car {
	// A Car has a model, engine, weight and color.
	private String model;
	private Engine engine;
	private int weight;
	private String color;

	public Car(String model, Engine engine, int weight, String color) {
		this.model = model;
		this.engine = engine;
		this.weight = weight;
		this.color = color;
	}

	public Car(String model, Engine engine) {
		this(model, engine, 0, "n/a");
	}

	public Car(String model, Engine engine, int weight) {
		this(model, engine, weight, "n/a");
	}

	public Car(String model, Engine engine, String color) {
		this(model, engine, 0, color);
	}
	// <CarModel>:
	// <EngineModel>:
//	Weight: <CarWeight>
//	Color: <CarColor>

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.model + ":").append(System.lineSeparator());
		sb.append(this.engine).append(System.lineSeparator());
		sb.append("Weight: ").append(this.weight == 0 ? "n/a" : this.weight).append(System.lineSeparator());
		sb.append("Color: ").append(this.color);
		return sb.toString();
	}

}
