package oop3;

public class Main {

	public static void main(String[] args) {
	
		Logger[]loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		Customer engin=new Customer(1,"Engin","Demiro�");
		customerManager.add(engin);

	}

}
