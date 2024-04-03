package AbstractFactoryPattern;

public class Sbi implements Bank{
	private final String bName;
	
	public Sbi() {
		bName="sbi";
	}

	@Override
	public String getBankName() {
		
		return bName;
	}
	

}
