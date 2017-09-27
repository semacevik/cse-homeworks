import java.util.Date;
public class Test{
	public static void main (String [] args){
		PersonalData x=new PersonalData(93,01,01,145);//personal data object is created with birthdate and ssn
		PersonalData y=new PersonalData(93,10,10,439);//personal data object is created with birthdate and ssn
		PersonalData z=new PersonalData(94,05,22,204);//personal data object is created with birthdate and ssn
		PersonalData t=new PersonalData(92,07,14,408);//personal data object is created with birthdate and ssn
		PersonalData m=new PersonalData(94,12,03,204);//personal data object is created with birthdate and ssn
		
	
	Student Student1=new Student("Gülşah YILDIRIM ",5005,2.17,x);//Student object is created with all features
	Student Student2=new Student("Merve ALTINAY ",5006,3.02,y);//Student object is created with all features
	Student Student3=new Student("Harun DEMİR ",5007,3.89,z);//Student object is created with all features
	Student Student4=new Student("Begüm YOLDAS ",5008,3.21,t);//Student object is created with all features
	Student Student5=new Student("Esra YILMAZ ",5009,3.46,m);//Student object is created with all features
	
	Course course1=new Course("cse141",2);//created course name is course1

 course1.addStudent(Student1);//Students are individually added to course1
 course1.addStudent(Student2);
 course1.addStudent(Student3);
 course1.addStudent(Student5);//not add.because capacity is not enough

 course1.list();//course1 is printed in list
		course1.increaseCapacity();//increased  capacity of course1 
		course1.addStudent(Student4);//add student4
		course1.addStudent(Student5);//add student5

		course1.list();
		course1.dropStudent(Student5);//not drop because there isn't in course1
		course1.list();
	System.out.println("The number of enrolled to CSE141 is "+course1.getNumberOfStudents()+"\n");
		
	System.out.println("The birthdate year of best student of CSE141 is "+course1.getBestStudent().getPersonalData().getBirthDate().getYear()+"\n");

   Course course2=new Course("CSE142");
   
 
 Student[]swap=course1.getStudents();//course2 adds to all students in course1
		int w=0;
		while(w<course1.getNumberOfStudents()){
			course2.addStudent(swap[w]);
			w++;
		}
		course2.list();
			System.out.println("The GPA of youngest student of CSE142 is "+course2.getYoungestStudent().getGpa());//the average of the youngest students in course2 suppresses
		course1.clear();
		
		System.out.println("The result of the operation "+course1.dropStudent(Student5)+"\n");
		course2.list();
		course2.dropStudent(course2.getBestStudent());
		course2.list();	
		course1.list();
		
	
   }
}