import java.util.Scanner;
/**
 * Lab06 Assignment1.
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class TestEmployee
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
    
    Employee1 emp1 = new Employee1(number, name, salary);
    
    System.out.println("\nEnter Name for Employee 2: ");
    name = input.nextLine();
    
    System.out.println("\nEnter number for Employee 2: ");
   number = input.nextInt();
   
    Employee1 emp2 = new Employee1(number , name);
    
    emp2.setSalary(emp1.getSalary());
    emp1.deductions(50);
    emp2.deductions(60, 40);
    emp1.printDetails();
    emp2.printDetails();
   
    }
}
