package FactoryPack;

public class Maruti implements Car{

	@Override
	public void drive() {
		System.out.println("Driveing maruti car");
	}

	@Override
	public void price() {
		System.out.println("maruti car rpice 12 lack rupees");		
	}
	
	
}
