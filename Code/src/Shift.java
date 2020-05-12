
public class Shift {

	private Employee employee;
	private Date date;
	private Analysis analysis;
	private String note;
	
	public Shift(Employee employee, Analysis analysis, String note)
	{
	   this.employee = employee;
	   this.analysis = analysis;
	   this.note = note;
	   date = new Date();
	}
	
	public Shift(Employee employee, Date date, Analysis analysis, String note)
	{
	   this.employee = employee;
	   this.analysis = analysis;
	   this.note = note;
	   this.date = date;
	}
	
	public Shift(Employee employee, Analysis analysis)
	{
	   this.employee = employee;
	   this.analysis = analysis;
	   date = new Date();
	   note = "";
	}
	
	public Shift(Employee employee, Date date, Analysis analysis)
	{
	   this.employee = employee;
	   this.analysis = analysis;
	   this.date = date;
	   note = "";
	}
	
	public String toString()
	{
	   return "Employee: " + employee.getFirstName() + " " + employee.getSurname() + "\nDate: " + date +
	         "\nAnalysis: " + analysis + "\nNote: " + note; 
	}
}
