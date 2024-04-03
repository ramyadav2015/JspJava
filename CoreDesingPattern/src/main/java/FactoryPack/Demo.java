package FactoryPack;

public class Demo {
	
	public static void main(String[] args) {
		Car maruti = FactoryPatternClass.getInstance("maruti");
		Car toyota = FactoryPatternClass.getInstance("toyota");
		Car bajaj = FactoryPatternClass.getInstance("bajaj");
		Car honda = FactoryPatternClass.getInstance("honda");
		
		maruti.drive();
		maruti.price();
		
		toyota.drive();
		toyota.price();
		
		bajaj.drive();
		bajaj.price();
		
		honda.drive();
		honda.price();
	}

}
