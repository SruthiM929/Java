package package1;

import java.util.Scanner;

public class PerimeterofSquare 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Length of Square:");
		double Length= s1.nextDouble();
		
		double Perimeter =4*Length ;
		
		System.out.println("The Perimeter of the Square is:");
		System.out.println(Perimeter);
		s1.close();
	}

}
