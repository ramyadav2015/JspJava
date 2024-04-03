package AbstractFactoryPattern;

public class Hdfc implements Bank{
	private final String bName;
	
	public Hdfc() {
		bName="hdfc";
	}
	@Override
	public String getBankName() {
		
		return bName;
	}

}
