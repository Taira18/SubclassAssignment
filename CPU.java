
public class CPU extends ProcessingUnit {
	private double cores;
	private double threads;

	public CPU(String model, String freq, double watt, double phys, double multi) {
		super(model, freq, watt);
		cores = phys;
		threads = multi;
	}
	public double getCores() {
		return cores;
	}
	public double getThreads() {
		return threads;
	}
	public void setCore(double phys) {
		cores = phys;
	}
	public void setThreads(double multi) {
		threads = multi;
	}
}
