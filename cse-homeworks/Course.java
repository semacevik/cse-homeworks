public class Course{
	private String name;
	private int capacity=40;
	 private Student[] students=new Student[100];//created array with length 100 
	private int numberOfStudents;
	public Course(String name){
		this.name=name;
	}
	public Course(String name,int capacity){//created course with name and capacity
		this.name=name;
		this.capacity=capacity;
		
	}
	public int getNumberOfStudents(){//returned number of students
		return numberOfStudents;
	}
	public String getCourseName(){//returned coursename
		return name;
	}
	public Student[]getStudents(){// return (Student) students
		return students;
	}
	public boolean addStudent(Student St){ //courses that students were adding controls
		   if (numberOfStudents > capacity)
   return false;
   else{
   for(int a=0;a<numberOfStudents;a++){
   	//if(students[a].getId()==St.getId())
  if(St.equals(students[a]))// if they are same
   return false;
   }
   students [numberOfStudents] = St;
   numberOfStudents++;
   return true;
   }
	}
   public boolean dropStudent(Student xy){//checks that emits from the course students
   	int count=0;
for(int i=0;i<students.length;i++){
if(xy.equals(students[i])){
students[i]=null;

count++;
break;
}
}
if (count==1){

numberOfStudents--;
return true;
}
else
return false;

   }  	
	
        public void increaseCapacity(){// capacity is increased
       this.capacity=capacity+5;                              

    }
   

      public Student getBestStudent(){// find best student and returned  the highest average is the most successful
     Student bestStudent=null;
     for(int i=0;i<students.length;i++){                                         
     	 if(students[i] != null && students[i+1] != null){
     if(students [i+1].getGpa()>students [i].getGpa())
     bestStudent=students [i+1];

      // else if(students [i+1]==null){
       // break;
      // }
     }
        
     }
     return bestStudent;
    }
    public Student getYoungestStudent(){// find youngest student. if The smallest is the youngest date of birth
int result=0;
Student youngestStudent=students[0];
for(int i=1;i<numberOfStudents;i++){
result=(students[i].getPersonalData().getBirthDate()).compareTo(students[i-1].getPersonalData().getBirthDate());
if(result>0){
youngestStudent=students[i];
}
}
return youngestStudent;
}

   public void clear(){//delete students from the course
for(int i=0;i<students.length;i++){
numberOfStudents=0;
}
}
public void list(){//students in the course lists
Student students[] = getStudents();
System.out.println(name);
for(int i = 0; i<numberOfStudents;i++){
if(students[i]!=null)
System.out.println(students[i]);
}
}
public  String toString(){
String result;
result=name+"\n";
result+=numberOfStudents+"\n";
for(int i=0;i<numberOfStudents;i++){
 result+=students [i].getId()+"\n";
}
return result;
}





   

		
	}
	
