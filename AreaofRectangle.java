package package1;

import java.util.Scanner;

public class AreaofRectangle
{

	public static void main(String[] args)
	{
		Scanner	s1=new Scanner(System.in);
		System.out.println("Enter the length of the Rectangle:");
		double length=s1.nextDouble();
		
		System.out.println("Enter the width of the Rectangle:");
		double width=s1.nextDouble();
		
		double area=length * width;
		System.out.println("Area of the Rectangle: ");
		System.out.println(area);
	}

}
