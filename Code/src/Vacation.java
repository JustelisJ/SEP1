
public class Vacation {

private Date startDate;
private Date endDate;
private Employee employee;
private boolean approved;

public Vacation (Date startDate, Date endDate, Employee employee) {
	this.startDate = startDate;
	this.endDate = endDate;
	this.employee = employee;
	approved = false;
}

public Date getStartDate() {
	return startDate;
}

public Date getEndDate() {
	return endDate;
}

public Employee getEmployee() {
	return employee;
}

public void approveVacation()
{
   approved = true;
}

public boolean isApproved() {
	return approved;
}

public String toString()
{
   return startDate + " - " + endDate + "\nEmployee: " + employee.getFirstName() + " " + employee.getSurname() + "\nApproved: " + approved;
}
}
