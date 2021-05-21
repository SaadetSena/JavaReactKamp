package oop3;

public class CustomerManager {
	
	private Logger[] loggers ;
	  
    public CustomerManager(Logger[] loggers) {
    	this.loggers=loggers;
    }
    
	
	public void add(Customer customer) {	//loosy(gev�ek) - tightly(kat�) coupled
		
		System.out.println("M��teri eklendi: " + customer.getFirstName());
	     Utils.runLoggers(loggers, customer.getLastName());
		//Utils utils=new Utils();
		//utils.runLoggers(loggers, customer.getLastName());  --> bu new lemeyi Utils de static yapmazsak yapacakt�k.
}
	public void delete(Customer customer) {
		
		System.out.println("M��teri silindi "+ customer.getFirstName());
		 Utils.runLoggers(loggers, customer.getLastName());
	}
	
}