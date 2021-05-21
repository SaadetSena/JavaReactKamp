package oop3InterfaceDemo;

public class CustomerManager { // CustomerManager class�n�n

	ICustomerDal customerDal;

	public CustomerManager(ICustomerDal customerDal) { // constructor�n�n bir ICustomerDal istiyorum.

		this.customerDal = customerDal; // burdaki this, ICustomerDal customerDal; bu de�i�kene atama yapm�� oldu.

	}

	public void add() { // i� kodlar� burda yaz�l�r.
		// OracleCustomerDal oracleCustomerDal=new OracleCustomerDal(); --> Bunu yazarsak Oracle a ba�l� kalm�� oluruz.
		customerDal.Add();

	}
}
