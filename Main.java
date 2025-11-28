
public class Main {
	public static void main(String[] args) {
		
		//Se crea un "course" (curso) de la clase "Course"
		Course course = new Course("POO 1", "JC", 5);
		
		//Se crean "students" (estudiantes) de la clase "Student"
		Student student1 =  new Student(); 
		Student student2 = new Student("Alondra", "Ibarra");
		Student student3 = new Student("Javier", "Dominguez", 555555, 50, 5);
		
		//Enrola un arrayList de "student" (estudiantes)
		Student[]  studentsArray = {
				new Student("Gabriel", "Castillo", 270269, 95, 2),
				new Student("Lorena", "Ramos", 270273, 80, 4),
				new Student("Luis", "Torres", 131518, 50, 5)
		};
		
		//Enrola "students" (estudiantes) usando el método "enroll" de la clase "Course"
		course.enroll(student1);
		course.enroll(student2);
		course.enroll(student3);
		
		//Enrola el "studentArray" (array de estudiantes) usando el método overload "enroll" de la clase course
		course.enroll(studentsArray);
		
		//Muestra el total de "students" (estudiantes) enrolados en el curso con el método "countStudents" de la clase "Course"
		System.out.println("Total students unrolled: "+ course.countStudents());
		
		//Muesta el mayor "grade" (calificación) del "course" (curso) usando el método "bestGrade" de la clase "Course"
		System.out.println("Best grade: " + course.bestGrade());
		
		//Desenrola al "student2" usando el método "unEnrroll" de la clase "Course" y muestra el total de students
		course.unEnroll(student2);
		System.out.println("Total students unrolled: "+ course.countStudents());

		//Muestra el nombre completo de "student1" usando el método "printFullName" de la clase "Student"
		System.out.println("Full name student 1: ");
		student1.printFullName();
		
		//Promueve a "student1" al siguiente año usando el método "isApproved" para verificar si paso y lo promueve usando el método "changeYearIfApproved" ambas de la clase "Student"
		System.out.println("Is student 1 approved?: " + student1.isApproved());
		System.out.println("Year of student 1 before change: " + student1.year);
		System.out.println("Actual year of student 1: " + student1.changeYearIfApproved());
		
		//No se promueve a "stundent3" al siguiente año	...
		System.out.println("Is student 3 approved?: " + student3.isApproved());
		System.out.println("Year of student 3 before change: " + student3.year);
		System.out.println("Actual year of student 3: " + student3.changeYearIfApproved());
		
	}

}
