import java.util.Scanner;
/**
 * Lab04 Assignment1c.
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class TestEmployee3
{
    // instance variables - replace the example below with your own
   public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    int number;
    String name;
    double salary;
    
    System.out.println("Enter name for Employee 1: ");
    name = input.nextLine();
    System.out.println("enter ID number for employee one: ");
    number = input.nextInt();
    System.out.println("Enter Salary for employee onw: ");
    salary = input.nextDouble();
    
    Employee3 emp1 = new Employee3(number, name, salary);
    
    System.out.println("\nEnter Name for Employee 2: ");
    name = input.nextLine();
    
    System.out.println("\nEnter number for Employee 2: ");
   number = input.nextInt();
   
    Employee3 emp2 = new Employee3(number , name);
    
    emp2.setSalary(emp1.getSalary());
    emp1.deductions(50);
    emp2.deductions(60, 40);
    System.out.println(emp1);
    System.out.println(emp2);
   
    }
}
