
public class GPU extends ProcessingUnit {
	
	private double memory;
	private double compute;

	public GPU(String model, String freq, double watt, double gb, double shaders) {
		super(model, freq, watt);
		memory = gb;
		compute = shaders;
	}
	public double getMemory() {
		return memory;
	}
	public double getCompute() {
		return compute;
	}
	public void setMemory(double gb) {
		memory = gb;
	}
	public void setCompute(double shaders) {
		compute = shaders;
	}
}
