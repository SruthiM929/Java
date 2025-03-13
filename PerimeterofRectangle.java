package package1;

import java.util.Scanner;

public class PerimeterofRectangle
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Length of Rectangle:");
		double Length= s1.nextDouble();
		
		System.out.println("Enter the Width of Rectangle:");
		double Width= s1.nextDouble();
		
		double Perimeter =2 * Length * Width ;
		
		System.out.println("The Perimeter of the Rectangle is:");
		System.out.println(Perimeter);
		s1.close();
	}

}
