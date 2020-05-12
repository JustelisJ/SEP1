import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
	   Login login = new Login();
      System.out.println(login.varifyLogin("MiVi", "4321")); //Login test (works)
      System.out.println(login.varifyLogin("DiBo", "4321"));
      System.out.println(login.varifyLogin("DiBo", "1234"));
      System.out.println("\n");
      
		Date date = new Date();
		Date date1 = new Date(12, 28, 2018);
		System.out.println(date);	//for test class Date(works)
		System.out.println(date1);
		System.out.println("\n");
		
		EmployeeFile fileWork = new EmployeeFile();
		EmployeeList list = new EmployeeList();
		try
      {
         list = fileWork.readTextFile();  //Test to check if file input from a text file works(works)
      }
      catch (FileNotFoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
		
		fileWork.setFile("Employees.bin");   //checks if data can be written to a binary file(works)
		try
      {
         fileWork.writeBinaryFile(list);
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
		System.out.println(list.get(0));
		System.out.println("\n");
		
		list.remove(1);
		list.remove(0);
		try
      {
         list = fileWork.readBinaryFile();   //Checks if the binary file can read(works)
      }
      catch (ClassNotFoundException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      catch (IOException e)
      {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
		
		System.out.println(list.get(1));//for test class employeeList and employee(works)
		System.out.println("\n");
		Employee employee = new Employee("Justinas", "Jancys", "16769423", "asdd", false, true);
		list.add(employee);
		System.out.println(list.get(2));
		System.out.println("\n");
		
		Analysis analysis = new Analysis("Fat", "red", 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3);
		Analysis analysis1 = new Analysis("Fiber", "green", 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 2);
		AnalysisList anaList = new AnalysisList();
		anaList.add(analysis);
		anaList.add(analysis1);
		System.out.println(anaList.get(0));
		System.out.println(anaList.get(1));
		System.out.println("\n");
		
		Vacation vacation = new Vacation(date, date1, list.get(2));
		vacation.approveVacation();
		System.out.println(vacation);
		
		Shift shift = new Shift(list.get(0), anaList.get(0));
		Shift shift1 = new Shift(list.get(1), anaList.get(1), "Leave work early");
		Shift shift2 = new Shift(list.get(2), date1, anaList.get(0));
		Shift shift3 = new Shift(list.get(1), date1, anaList.get(0), "Will be late 30min");
		System.out.println(shift);
		System.out.println("\n");
		System.out.println(shift1);
      System.out.println("\n");
      System.out.println(shift2);
      System.out.println("\n");
      System.out.println(shift3);
      System.out.println("\n");
	}
}
