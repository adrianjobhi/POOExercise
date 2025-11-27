
public class Main {
	public static void main(String[] args) {
		
		//Se crea un curso
		Course course = new Course("POO 1", "JC", 5);
		
		//Se crean estudiantes
		Student student1 =  new Student(); 
		Student student2 = new Student("Alondra", "Ibarra");
		Student student3 = new Student("Javier", "Dominguez", 555555, 50, 5);
		
		//Enrola estudiantes
		course.enroll(student1);
		course.enroll(student2);
		course.enroll(student3);
		
		//Muestra el total de students enrolados
		System.out.println("Total students unrolled: "+ course.countStudents());
		
		//Muesta el mayor Grade de course
		System.out.println("Best grade: " + course.bestGrade());
		
		//Desenrola al "student2" y muestra el total de students
		course.unEnroll(student2);
		System.out.println("Total students unrolled: "+ course.countStudents());

		//Muestra el nombre completo de student1
		System.out.println("Full name student 1: ");
		student1.printFullName();
		
		//Promueve a "student1" al siguiente año
		System.out.println("Is student 1 approved?: " + student1.isApproved());
		System.out.println("Year of student 1 before change: " + student1.year);
		System.out.println("Actual year of student 1: " + student1.changeYearIfApproved());
		
		//No se promueve a "stundent3" al siguiente año
		System.out.println("Is student 3 approved?: " + student3.isApproved());
		System.out.println("Year of student 3 before change: " + student3.year);
		System.out.println("Actual year of student 3: " + student3.changeYearIfApproved());


		
	}

}
