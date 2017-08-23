
public class Run {
	public static void main(String[] args) {
		ProcessingUnit unit1 = new ProcessingUnit("Myriad 2", "600Mhz", 0.5);
		ProcessingUnit unit2 = new ProcessingUnit("Tensor", "700Mhz", 40);
		ProcessingUnit unit4 = new ProcessingUnit("GTX980Ti","1317Mhz",375);
		ProcessingUnit unit5 = new ProcessingUnit("HD7990", "950Mhz",570);
		ProcessingUnit unit6 = new ProcessingUnit("FX-9590","4.7Ghz", 220);
		ProcessingUnit unit7 = new ProcessingUnit("i3-7300T","3.5Ghz",35);
		ProcessingUnit unit3 = new ProcessingUnit("TrueNorth", "46Ghz", 0.7);
	
		GPU k1 = new GPU("R7 240","730Mhz",75,2,320);
		GPU k2= new GPU("RX480","1.2Ghz",150,8,2304);
		GPU k3= new GPU("R9 Fury X","1Ghz",375,4,4096);
		GPU k4= new GPU("GTX1050Ti","1.3Ghz",70,4,768);
		GPU k5= new GPU("GTX1080Ti","1.5Ghz",280,11,3584);
		GPU k6= new GPU("RX Vega 64 Liquid","1.4Ghz",345,8,4096);
		GPU k7= new GPU("Titan X","1Ghz",250,12,3072);
	
		CPU z1= new CPU("FX4300","3.8Ghz",95,4,4);
		CPU z2= new CPU("i5-6600","3.3Ghz",65,4,4);
		CPU z3= new CPU("i7-7700","3.6Ghz",65,4,8);
		CPU z4= new CPU("i9-7900X","3.3Ghz",140,10,20);
		CPU z5= new CPU("R7 1700","3Ghz",65,8,16);
		CPU z6= new CPU("Threadripper 1950X","3.4Ghz",180,16,32);
		CPU z7= new CPU("Xeon Phi SC7120X","1.2Ghz",300,61,244);
		
		unit1.getProcessingUnitInfo();
		System.out.println();
		unit2.getProcessingUnitInfo();
		System.out.println();
		unit3.getProcessingUnitInfo();
		System.out.println();
		unit4.getProcessingUnitInfo();
		System.out.println();
		unit5.getProcessingUnitInfo();
		System.out.println();
		unit6.getProcessingUnitInfo();
		System.out.println();
		unit7.getProcessingUnitInfo();
		System.out.println();
		
		k1.getProcessingUnitInfo();
		System.out.println(" Memory:" + k1.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k1.getCompute());
		System.out.println();
		k2.getProcessingUnitInfo();
		System.out.println(" Memory:" + k2.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k2.getCompute());
		System.out.println();
		k3.getProcessingUnitInfo();
		System.out.println(" Memory:" + k3.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k3.getCompute());
		System.out.println();
		k4.getProcessingUnitInfo();
		System.out.println(" Memory:" + k4.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k4.getCompute());
		System.out.println();
		k5.getProcessingUnitInfo();
		System.out.println(" Memory:" + k5.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k5.getCompute());
		System.out.println();
		k6.getProcessingUnitInfo();
		System.out.println(" Memory:" + k6.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k6.getCompute());
		System.out.println();
		k7.getProcessingUnitInfo();
		System.out.println(" Memory:" + k7.getMemory()+"GB");
		System.out.println(" Stream Processors:"+k1.getCompute());
		System.out.println();
		
		z1.getProcessingUnitInfo();
		System.out.println(" Cores:" + z1.getCores());
		System.out.println(" Threads:"+ z1.getThreads());
		System.out.println();
		z2.getProcessingUnitInfo();
		System.out.println(" Cores:" + z2.getCores());
		System.out.println(" Threads:"+ z2.getThreads());
		System.out.println();
		z3.getProcessingUnitInfo();
		System.out.println(" Cores:" + z3.getCores());
		System.out.println(" Threads:"+ z3.getThreads());
		System.out.println();
		z4.getProcessingUnitInfo();
		System.out.println(" Cores:" + z4.getCores());
		System.out.println(" Threads:"+ z4.getThreads());
		System.out.println();
		z5.getProcessingUnitInfo();
		System.out.println(" Cores:" + z5.getCores());
		System.out.println(" Threads:"+ z5.getThreads());
		System.out.println();
		z6.getProcessingUnitInfo();
		System.out.println(" Cores:" + z6.getCores());
		System.out.println(" Threads:"+ z6.getThreads());
		System.out.println();
		z7.getProcessingUnitInfo();
		System.out.println(" Cores:" + z7.getCores());
		System.out.println(" Threads:"+ z7.getThreads());
		System.out.println();
		
		k2.setMemory(4);
		System.out.println(k2.getName()+" was downgraded to the " + k2.getMemory()+ "GB version from the 8GB version.");
		System.out.println();
		k7.setCompute(7168);
		System.out.println("A "+ k7.getName()+ " running in SLI with another "+k7.getName()+ " gives a total of " + k7.getCompute()+ " Stream Processors");
		System.out.println();
		z7.setCore(288);
		System.out.println(z7.getName()+ " was introduced to a server. The server now has "+ z7.getCores()+ " cores total.");
		
		

	}
}
