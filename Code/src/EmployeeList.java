import java.io.Serializable;
import java.util.ArrayList;

public class EmployeeList implements Serializable
{
   private ArrayList<Employee> employees;
   
   public EmployeeList()
   {
      employees = new ArrayList<Employee>();
   }
   
   public void add(Employee employee)
   {
      employees.add(employee);
   }
   
   public void remove(int index)
   {
      employees.remove(index);
   }
   
   public void remove(Employee employee)
   {
      employees.remove(employee);
   }
   
   public Employee get(int index)
   {
      return employees.get(index);
   }
   
   public int getSize()
   {
      return employees.size();
   }
}
