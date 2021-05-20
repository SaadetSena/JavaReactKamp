package oop2Odev;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.name = "Sena";
		student.surname = "G�rel";
		student.gottenlesson_name = "Java";
		student.email = "sena123@gmail.com";

		Instructor instructor = new Instructor();
		instructor.name = "Engin";
		instructor.surname = "Demirog";
		instructor.givenlesson_name = "Java";
		instructor.email = "engindemirog@gmail.com";

		UserManager usermanager = new UserManager();
		// Bu kullan�m teker teker yazd���m�z i�in kullan��s�z.
		
		/*
		  usermanager.login(instructor); usermanager.login(student);
		  usermanager.logout(instructor); usermanager.logout(student);
		  usermanager.change_name(instructor); usermanager.change_name(student);
		 */

		// Bu kullan�mla kullan��l� bir �ekilde d�ng�m�zdeki t�m kullan�c�lar gezildi ve t�m metodlar yazd�r�ld�.
		User[] users = { student, instructor };
		usermanager.multipleUser(users);

	}
}
