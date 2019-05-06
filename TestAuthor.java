import java.util.Scanner;
/**
 * Lab06 Assignment4
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class TestAuthor
{
    public static void main(String[] args){
        // instance variables - replace the example below with your own
    Scanner input = new Scanner(System.in);
    
    String name;
    String email;
    char gender;

    System.out.println("Enter name:");
    name = input.nextLine();
    System.out.println("Gender:");
    gender = input.next().charAt(0);
    System.out.println("Enter Email:");
    email = input.nextLine();
    
    Author badGuy = new Author(name, gender, email);
    
    System.out.println("Enter new Email for Author");
    badGuy.setEmail(input.nextLine());
    
    System.out.println(badGuy);
    
    }
}
