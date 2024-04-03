package AbstractFactoryPattern;

abstract class Loan {
	
	double rate;
	abstract void getInterestRate(double rate);
	
	public void calculateLoanPayment(double loanamount, int years) {
		  double EMI;  
	         int n;
	         int m=1;
	         
	         n=years*12;  
	         rate=rate/1200;  
	         EMI=((rate*Math.pow((m+rate),n))/((Math.pow((m+rate),n))-m))*loanamount;  
	         
	         System.out.println("your monthly EMI is "+ EMI +" for the amount"+loanamount+" you have borrowed");  
	}

}
