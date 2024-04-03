package AbstractFactoryPattern;

public class Icici implements Bank{
	private final String bName;
	
	public Icici() {
		bName="icici";
	}
	
	@Override
	public String getBankName() {
		
		return bName;
	}
	
	

}
