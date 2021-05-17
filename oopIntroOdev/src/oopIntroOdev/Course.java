package oopIntroOdev;

public class Course {
	
	String programadi; 
	int izlemeyuzdesi;
	String egitmenadi;

	public Course() { //Constructor bloktur ve class�n ge�erli olabilmesi i�in gereklidir.
		
		//System.out.println("Ben �al��t�m");
		
}
	
	public Course( String programadi, int  izlemeyuzdesi, String egitmenadi){
	
		this(); // Di�er constructor'� �al��t�rmak i�in this(); fonksiyonu getirilir.
		
		//Bu class'ta yani en yukar�da tan�mlad���m�z alan yukar�da parantezin i�indeki alanda verilen de�ere e�itliyoruz.
		this.programadi = programadi; 
		this.izlemeyuzdesi =izlemeyuzdesi;
		this.egitmenadi =egitmenadi ;
	}

}
