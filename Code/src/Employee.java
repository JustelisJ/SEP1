import java.io.Serializable;
import java.util.ArrayList;

public class Employee implements Serializable {
private String firstName;
private String surname;
private String email;
private String phoneNumber;
private String initials;
private String password;
private boolean isATeamLeader;
private boolean workRestricted;
private ArrayList<Analysis> trainedIn;
private ArrayList<String> preferences;//Not implemented

public Employee ( String firstName, String surname, String phoneNumber, String password, boolean isATeamLeader, boolean workRestricted) {
	this.firstName = firstName;
	this.surname = surname;
	initials = firstName.substring(0, 2) + surname.substring(0, 2);
	email = initials + "@eurofins.dk";
	setPhoneNumber(phoneNumber);
	this.password = password;
	this.isATeamLeader = isATeamLeader;
	this.workRestricted = workRestricted;
}

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getEmail() {
	return email;	//default domain for eurofins initials@eurofins.dk
}
public void setEmail(String email) {
	this.email = email + "@eurofins.dk";
}
public String getSurname() {
	return surname;
}
public void setSurname(String surname) {
	this.surname = surname;
}
public void setPhoneNumber(String phoneNumber) {
	if(phoneNumber.length() == 8)
	   this.phoneNumber = phoneNumber;
}
public String getPhoneNumber() {
	return phoneNumber;
}

public String getInitials() {
	return initials;
}
public void setPassword(String password)
{
   this.password = password;
}
public String getPassword()
{
   return password;
}
public void setIsATeamLeader(boolean value)
{
   isATeamLeader = value;
}
public boolean getIsATeamLeader()
{
   return isATeamLeader;
}
public boolean getWorkRestricted() {
	return workRestricted;
}
public void setWorkRestricted(boolean workRestricted) {
   this.workRestricted = workRestricted;
}

public void trainEmployee(Analysis analysis)
{
   trainedIn.add(analysis);
}

public String toString() {
	return getFirstName()+"\n" + getSurname()+"\n" + getPhoneNumber()+"\n" + getEmail();}
}
