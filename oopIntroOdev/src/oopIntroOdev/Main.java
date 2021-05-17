package oopIntroOdev;

public class Main {

	public static void main(String[] args) {
		
	
		Course course1=new Course();
		
	    course1.egitmenadi="Engin Demiro�";
		course1.izlemeyuzdesi=42;
	    course1.programadi="Java-React";
		
		
		Course course2= new Course("Engin Demiro�",43,"C#");
		
		
	
		//T�m kurslar� gezmesi i�in foreach kulland�k
		Course[] courses= {course1,course2};
		
		for(Course course:courses) {
			System.out.println(course.egitmenadi);
			
		}

		// T�m sayfalar i�in kullan�lan ortak bir durum i�in kullan�lan class
		CourseManager courseManager = new CourseManager();
		courseManager.devambitir(course1);
		courseManager.oncekiders(course2);
		

		
	}

}
