import java.util.Scanner;
/**
 * Lab06 Assignment5
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */

public class BoxDemo
{
  public static void main(String[] args)
  {
      /*Scanner input = new Scanner(System.in);
      System.out.println("Enter the Length of the Box: ");
      double l = input.nextDouble();
      
      System.out.println("Enter the Width of the Box: ");
      double w = input.nextDouble();
      
      System.out.println("Enter the Height of the Box: ");
      double h = input.nextDouble();*/
      
      Box box1 = new Box(20.0, 10.0, 15.0);
      Box box2 = new Box(6.0);
      Box box3 = box1;
      
      
      System.out.println("The volume of box1 is: " + box1.volume() + " cubic cm");
      System.out.println("The surface area of box1 is: " + box1.surfaceArea() + " square cm");
      System.out.println(box1);
      
      System.out.println("The volume of box2 is: " + box2.volume() + " cubic cm");
      System.out.println("The surface area of box2 is: " + box2.surfaceArea() + " square cm");
      System.out.println(box2);
      
      System.out.println("The volume of box3 is: " + box3.volume() + " cubic cm");
      System.out.println("The surface area of box3 is: " + box3.surfaceArea() + " square cm");
      System.out.println(box3);
  }
}