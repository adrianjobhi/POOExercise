
import java.util.ArrayList;
import java.util.Iterator;

public class Course {
	   //Se agregan los atributos de Course
		String courseName;
		String professorName;
		int year;

		ArrayList<Student> students = new ArrayList();
		
		//CONSTRUCTOR
		public Course(String courseName, String professorName, int year) {
	        this.courseName = courseName;
	        this.professorName = professorName;
	        this.year = year;
	    }
		
		//MÉTODOS
		
		public void enroll(Student student){//Enrola a "student" (estudiante) si no exite, sino manda que ya exite
			students.add(student);
		}//enroll

		public void unEnroll(Student student){ //Desenrola a "student" (estudiante) si exite, sino manda que no lo encuentra
			if(students.contains(student)) {
				students.remove(student);
			}else {
				System.out.println("Student not found");
			}
		       
		}//unEnroll

	   public int countStudents(){ //Regresa el numero de "student" (estudiantes) que existen
		   return students.size();
	   }//countStudents
		   
	   public int bestGrade(){ //Regresa el valor mayor "bestGrade" usando iterator
		   Iterator<Student> iterator = students.iterator();
		   int bestGrade = 0;
		   while(iterator.hasNext()) {
			   Student grade = iterator.next();
			   
			   if(grade.grade>bestGrade) {
				   bestGrade = grade.grade;
			   }
		   }
		   
		   return bestGrade;
	   }//bestGrade
	   
	   public double averageGrade(){ //Regresa el valor mayor "averageGrade" usando iterator
		   Iterator<Student> iterator = students.iterator();
		   double averageGrade = 0;
		   while(iterator.hasNext()) {
			   Student grade = iterator.next();
			   averageGrade += grade.grade;
		   }
		   averageGrade = averageGrade/students.size();
		   return averageGrade;
	   }//bestGrade
	   
	   //Overload enroll. Enrola todo un arrayList de "students" (estudiantes)
	   public void enroll(Student[] studentsArray) {
		   for(Student s : studentsArray) {
			   students.add(s);
		   }
	   }//overload enroll
	   
	   
		
}
