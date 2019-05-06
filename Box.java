/**
 * Lab06 Assignment5
 *
 * @author (AMINA HAMID U15/FNS/CSC/050)
 * @version (a version number or a date)
 */
public class Box
{
    private double length, width, height;
    
    public Box(double boxLength, double boxWidth, double boxHeight)
    {
        length = boxLength;
        width = boxWidth;
        height = boxHeight;
    }
    
    public Box(double boxLength)
    {
        length = boxLength;
        width = boxLength;
        height = boxLength;
        
        
    }
    
    public double volume()
    {
        return length * width * height;
    }
    
    public double surfaceArea()
    {
        return 2 * (length*width + length*height + width*height);
    }
    
    public double getLength()
    {
        return length;
    }
    
    public double getWidth()
    {
        return width;
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public String toString()
    {
        return "Length = " + length + " Width = " + width + " Height = " + height + "\n";
    }
    
}
