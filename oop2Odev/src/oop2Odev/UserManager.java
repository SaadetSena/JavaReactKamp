package oop2Odev;

public class UserManager {

	public void login(User user) { // oturum a�ma metodu

		System.out.println(user.email + " maili ile oturum a��ld�.");

	}

	public void logout(User user) { // oturum kapama metodu

		System.out.println("Oturum kapat�ld�.");

	}

	public void change_name(User user) { // ad de�i�tirme metodu

		System.out.println(user.name + " adl� kullan�c�n�n ad� de�i�tirildi.");
	}

	public void multipleUser(User[] users) { // kullan�c�lar�n gezilmesi i�in olu�turulan array

		// t�m kullan�c�lar�n teker teker for d�ng�s� ile gezilmesi.
		for (User user : users) {

			System.out.println("--------------------");

			change_name(user);
			login(user);
			logout(user);
		}

	}

}
