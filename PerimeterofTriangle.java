package package1;

import java.util.Scanner;

public class PerimeterofTriangle
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the Length1 of the Triangle:");
		double Length1= s1.nextDouble();
		
		System.out.println("Enter the Length2 of the Triangle:");
		double Length2= s1.nextDouble();
		
		System.out.println("Enter the Length3 of the Triangle:");
		double Length3= s1.nextDouble();
		
		double Perimeter =Length1 + Length2 + Length3;
		
		System.out.println("The Perimeter of the Triangle is:");
		System.out.println(Perimeter);
		s1.close();
	}

}

