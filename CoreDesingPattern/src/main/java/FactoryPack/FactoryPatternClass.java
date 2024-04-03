package FactoryPack;

public class FactoryPatternClass {
	
	 public static Car getInstance(String company) {
		  
	        switch(company.trim()) {
	            case "maruti":
	                return new Maruti();
	                
	            case "toyota":
	                return  new Toyota();
	                
	            case "bajaj":
	                return new Bajaj();
	                
	            case "honda":
	                return new Honda();
	                
	            default:
	                return null;
	        }
	    }
}
