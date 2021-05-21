package oop3AbstractDemo;

//KURAL1: Burdaki abstract sadece class� etkiliyor, metodlar abstract olmak zorunda de�il!
//KURAL2: Abstract s�n�flar asla TEK BA�INA NEW lenemez! Kullanmak i�in gene ezmek yani OVERR�DE etmek GEREK�R.
//kural3: Abstract metod varsa, override edilme ZORUNLULU�U vard�r.



public abstract class  GameCalculator { //sadece referans tutcu ve kural koyucu olmu� oldu.
	public abstract void score() ;     // Abstractdan dolay� bunu kullanacak class override etmek ZORUNDA ! (Yani her class kendi hesaplas�n� yazmak zorunda.)
		
		//System.out.println("Puan�n�z: 100 "); 
	
	public final void gameOver() { // Final ile override edilemez hale geldi. Herkes sadece bu �ekilde kullanabilir. De�i�ime kapatt�k.
		
		System.out.println("Oyun bitti ! ");
		
	}	
		
}

