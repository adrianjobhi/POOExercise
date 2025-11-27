
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
		
		public void enroll(Student student){//Enrola a estudiante si no exite, sino manda que ya exite
			students.add(student);
		}//enroll

		public void unEnroll(Student student){ //Desenrola a estudiante si exite, sino manda que no lo encuentra
			if(students.contains(student)) {
				students.remove(student);
			}else {
				System.out.println("Student not found");
			}
		       
		}//unEnroll

	   public int countStudents(){ //Regresa el numero de estudiantes que existen
		   return students.size();
	   }//countStudents
		   
	   public int bestGrade(){
		   Iterator<Student> iterator = students.iterator();
		   int bestGrade = 0;
		   while(iterator.hasNext()) {
			   Student grade = iterator.next();
			   
			   if(grade.grade>bestGrade) {
				   bestGrade = grade.grade;
			   }
		   }
		   
		   return bestGrade;
	   }
		
}
