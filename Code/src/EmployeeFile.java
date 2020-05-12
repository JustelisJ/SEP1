import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeFile
{
   private File file;
   
   public EmployeeFile()
   {
      file = new File("EmployeesStart.txt");
   }
   
   public void setFile(String fileName)
   {
      file = new File(fileName);
   }
   
   public File getFile()
   {
      return file;
   }
   
   public EmployeeList readBinaryFile() throws IOException, ClassNotFoundException
   {
      ObjectInputStream in = null;
      EmployeeList employees = null;
      try
      {
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         employees = (EmployeeList)in.readObject();
         
      }
      catch(IOException | ClassNotFoundException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
      }
      return employees;
   }
   
   public void writeBinaryFile(EmployeeList list) throws IOException
   {
      ObjectOutputStream out = null;
      
      try
      {
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         out.writeObject(list);
      }
      catch(IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            out.close();
         }
         catch(IOException e)
         {
            e.printStackTrace();
         }
      }
   }
   
   public EmployeeList readTextFile() throws FileNotFoundException
   {
      Scanner input;
      EmployeeList list = new EmployeeList();
      try
      {
         input = new Scanner(file);
         while(input.hasNext())
         {
            String line = input.nextLine();
            String[] token = line.split(";");
            String firstName = token[0].trim();
            String surName = token[1].trim();
            String phone = token[2].trim();
            String password = token[3].trim();
            boolean isATeamLeader = Boolean.parseBoolean(token[4].trim());
            boolean workRestricted = Boolean.parseBoolean(token[5].trim());
            Employee employee = new Employee(firstName, surName, phone, password, isATeamLeader, workRestricted);
            list.add(employee);
         }
         input.close();
      }
      catch(FileNotFoundException e)
      {
         e.printStackTrace();
      }
      return list;
   }
}
