
/**
 * Lab06 Assignment2.
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class Employee2
{
    // instance variables - replace the example below with your own
    private int iDNumber;
    private String name;
    private double salary;
    

    /**
     * Constructor for objects of class Employee1
     */
    public Employee2(int iDNumber , String name , double salary)
    {
        // initialise instance variables
       this.iDNumber = iDNumber;
       this.name = name;
       this.salary = salary;
      
    }

    
    /**
     * Constructor for objects of class Employee1
     */
    public Employee2(String name ,int iDNumber , double salary)
    {
        // initialise instance variables
       this(iDNumber,name,salary);
      
    }
    public Employee2( int iDNumber, String name )
    {
        // initialise instance variables
       this(name,iDNumber);
      
    }
    public Employee2(String name ,  int iDNumber)
    {
        // initialise instance variable
      this(name , iDNumber , 0.0);
     
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setSalary(double salary)
    {
        // put your code here
        this.salary = salary;
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

