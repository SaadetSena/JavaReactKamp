package oopIntro;

public class Product {
	
	int id; // Nesneyi di�er nesnelerden ay�ran benzersiz say�
	String name; //�r�n Ad�
	double unitPrice; //Birim Fiyat�
	String detail; //�r�n A��klamas�
   
	
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	
	public Product(int id, String name, double unitPrice, String detail){
		
		// Di�er constructor'� �al��t�rmak i�in this(); fonksiyonu getirilir.
		this();
		
		// Bu class'ta yani en yukar�da tan�mlad���m�z alan yukar�da parantezin i�indeki alanda verilen de�ere e�itliyoruz.
		this.id = id; 
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

}
