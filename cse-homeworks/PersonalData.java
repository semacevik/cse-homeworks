import java.util.Date;
public class PersonalData{
private	Date birthDate;
private String address;
private long ssn;

public PersonalData(Date birthDate,long ssn){//created date and ssn
	this.birthDate=birthDate;
	this.ssn=ssn;
}
public PersonalData(int year, int month,int day,long ssn){// created birthdate
	birthDate=new Date(year,month,day);
	this.ssn=ssn;
}
public Date getBirthDate(){//returned birthdate
	return birthDate;
}
public String getAddress(){// return address
	return address;
}
public long getSsn(){
	return ssn;
}
public void  setAddress(String add){//con you set address
this.address=add;
}




 


	
}