public class Student{
	private String name;
	private long id;
	private double gpa;
	private long ssn;
	PersonalData pd; //=new PersonalData(year, month, day,ssn);
	public Student (String name, long id, double gpa, PersonalData pd){//created student obge
		this.name=name;
		this.id=id;
		this.gpa=gpa;
		this.pd=pd;
	}
	public String getName(){//return name
		return name;
	}
	public long getId(){//return id
		return id;
	}
	public double getGpa(){//return gpa
		return gpa;
	
	}
	public PersonalData getPersonalData(){
		return pd;
	}
	public String toString(){
	return this.name+this.id+this.gpa;
	}

}