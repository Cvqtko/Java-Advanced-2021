package ex_9;

class Cymric extends Cat {

	private double furLenght;

	public Cymric(String name, double furLenght) {
		super(name);
		this.furLenght = furLenght;
	}

	public double getFurLenght() {
		return furLenght;
	}

	public void setFurLenght(int furLenght) {
		this.furLenght = furLenght;
	}

	@Override
	public String toString() {
		return String.format("Cymric %s %.2f", super.getName(), this.furLenght);
	}

}