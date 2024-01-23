
public class PersonalInfo {
	private Person name;
	private Date bDay;
	private int personID;
	
	PersonalInfo() {
		name = new Person(); //firstName="",lastName="";
		bDay = new Date();	//dMonth = 1, dDay = 1, dYear = 1900;
		personID = 0;
	}
	
	PersonalInfo(String first,String last,int month, int day, int year, int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	public void setPersonalInfo(String first,String last,int month, int day, int year, int ID) {
		name = new Person(first,last);
		bDay = new Date(month,day,year);
		personID = ID;
	}
	
	public String toString() {
		return "Name: " + name.toString() + "\n" + "Date of birth: " +
	bDay.toString() + "\n" + "Personal ID: " + personID;
	}
}
