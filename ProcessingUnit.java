
public class ProcessingUnit {
	private String name;
	private String speed;
	private double tdp;
	
	public ProcessingUnit(String model, String freq, double watt) {
		name = model;
		speed = freq;
		tdp = watt;
	}
	public String getName() {
		return name;
	}
	public String getSpeed() {
		return speed;
	}
	public double getTdp() {
		return tdp;
	}
	public void getProcessingUnitInfo() {
		System.out.println("Name:"+name+" Frequency:"+speed+" Power draw up to:"+tdp+" watts");
	}
}
