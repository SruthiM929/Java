package package1;

import java.util.Scanner;//we need to import the java utilize for scanner by selecting Scanner and ctrl+shift+"o"

public class ScannerProgram
{
	public static void main(String[] args) 
	{
	
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the value of a");
		int a= 		s1.nextInt();
		System.out.println("please enter the value of a1");
		int a1= 	s1.nextInt();
		int sum=a+a1;
		System.out.println("the sum of the 2 given number: ");
		System.out.println(sum);
		s1.close();
		
		//byte b=		s1.nextByte();
		//float c=	s1.nextFloat();
		//double d=	s1.nextDouble();
		//boolean e=	s1.nextBoolean();
		//short f=	s1.nextShort();
		//long g= 	s1.nextLong();
		//String name=	s1.next();//
		
	}

}
