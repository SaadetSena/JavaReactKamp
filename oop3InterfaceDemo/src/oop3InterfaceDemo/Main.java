package oop3InterfaceDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		// customerManager.customerDal=new OracleCustomerDal(); --> veritaban� olarak bunu se�tim. T�m i�lemler bunun �zerinden ger�ekle�ecek.
		customerManager.add();
	}

}
