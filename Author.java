
/**
 * Lab06 Assignment4
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class Author
{
    // instance variables - replace the example below with your own
    private String name;
    private String email;
    private char gender;

    /**
     * Constructor for objects of class Author
     */
    public Author(String name,  char gender, String email)
    {
        // initialise instance variables
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    public String getEmail()
    {
        // put your code here
        return email;
    }
    public void setEmail(String email)
    {
        // put your code here
        this.email = email;
    }
    public char getGender()
    {
        // put your code here
        return gender;
    }
    public String toString(){
        return "\t "+name+"\t "+gender+"\t "+email;
    }
}
