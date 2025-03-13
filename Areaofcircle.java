package package1;
//using scanner class
import java.util.Scanner;

public class Areaofcircle
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the radius of the circle: ");
	double radius=s1.nextDouble();
	
	double area=Math.PI * radius * radius;
	System.out.println("The area of the circle: ");
	System.out.println(area);
	s1.close();	
}
}

