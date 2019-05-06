
/**
 * Lab06 Assignment1.
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class Employee1
{
    // instance variables - replace the example below with your own
    private int iDNumber;
    private String name;
    private double salary;
    

    /**
     * Constructor for objects of class Employee1
     */
    public Employee1(int iD , String employeeName , double employeeSalary)
    {
        // initialise instance variables
       iDNumber = iD;
       name = employeeName;
       salary = employeeSalary;
      
    }

    
    /**
     * Constructor for objects of class Employee1
     */
    public Employee1(String employeeName ,int iD , double employeeSalary)
    {
        // initialise instance variables
       iDNumber = iD;
       name = employeeName;
       salary = employeeSalary;
      
    }
    public Employee1(String employeeName ,int iD)
    {
        // initialise instance variables
       iDNumber = iD;
       name = employeeName;
     
      
    }
    public Employee1( int iD , String employeeName)
    {
        // initialise instance variable
       iDNumber = iD;
       name = employeeName;
     
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setSalary(double employeeSalary)
    {
        // put your code here
        salary = employeeSalary;
    }
    public int getIDNumber()
    {
        // put your code here
        return iDNumber;
    }
    public String getName()
    {
        // put your code here
        return name;
    }
    public double getSalary()
    {
        // put your code here
       return  salary;
    }
    public void deductions(double telephoneBills){
        salary -= telephoneBills;
    }
    public void deductions(double telephoneBills , double medicalBills){
        salary -= (telephoneBills + medicalBills);
    }
    public void raiseSalary(double percentIncrease){
        salary += salary * percentIncrease/100;
    }
    public void printDetails(){
        System.out.println("\nID Number: "+iDNumber+"\nName: "+name+"\nSalary: "+salary);
    }
}
