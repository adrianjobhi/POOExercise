  

public class Student {
	   //Se agregan los atributos de Student
       String firstName;
       String lastName;
       int registration;
       int grade;
       int year;
       
       //MÉTODOS
       public void printFullName(){ //Muestra el nombre completo
    	   System.out.println(firstName + " " + lastName);
       }//printFullName

       public boolean isApproved(){ //Regresa "true" si el "grade" (calificación) es igual o mayor que 60, sino regresa "False"
    	   if (grade >= 60) {
    		   return true;
    	   }else {
    		   return false;
    	   }
       }//isApproved

       public int changeYearIfApproved(){// Si el "grade" (calificación) es igual o mayor que 60 aumenta "year" + 1 e imprime "Congratulations"
    	   if (grade >= 60) {
    		   year += 1;
    		   System.out.println("Congratulation");
    	   }
    	   return year;
       }//changeYearIfApproved
       
       // CONSTRUCTORES
       public Student (String firstName, String lastName, int registration, int grade, int year) { //Construye Student desde todos los atributos completos
    	   this.firstName = firstName;
    	   this.lastName = lastName;
    	   this.registration = registration;
    	   this.grade = grade;
    	   this.year = year;
       }//Constructor
       
       public Student (String firstName, String lastName) {//Construye Student desde el "firstName" y "lastName"
    	   this (firstName, lastName, 802940, 75, 5);
       }//Constructor
       
       public Student () { //Construye Student desde 0
    	   this ("Job", "Hernández", 130898, 100, 5);
       }//Constructor
       
       
   }//class Student