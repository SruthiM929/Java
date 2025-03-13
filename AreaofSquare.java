package package1;

import java.util.Scanner;

public class AreaofSquare
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Side1 of the Square:");
		double Side1= s1.nextDouble();
		
		System.out.println("Enter the Side2 of the Square:");
		double Side2= s1.nextDouble();

		
		double Area =Side1 * Side2;
		
		System.out.println("The Area of the Square is:");
		System.out.println(Area);
		s1.close();
	}

}


