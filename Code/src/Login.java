import java.io.FileNotFoundException;

public class Login
{
   private EmployeeList employees;
   
   public Login() throws FileNotFoundException
   { 
      EmployeeFile file = new EmployeeFile();
      employees = file.readTextFile();
   }
   
   public String varifyLogin(String initials, String password)
   {
      String text = "Initials or password is incorrect";
      for(int i = 0; i < employees.getSize(); i++)
      {
         if(employees.get(i).getInitials().equals(initials) && employees.get(i).getPassword().equals(password))
         {  //if the initials and password are correct
            text = "Login successful";
            if(employees.get(i).getIsATeamLeader())
               text += ".  Team Leader view";   //if the user is a team leader open team leaders view
            else
               text += ".  Employee view";      //if the user is an employee, then open employee view
         }
      }
      return text;
   }
}
