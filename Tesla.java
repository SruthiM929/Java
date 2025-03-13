package package1;
//supercalling statment with  parameterized super calling statment
class Tesla1
{
	Tesla1(String Krupa)
	{
		System.out.println("Tesla1 is a parent Constructor:");
		System.out.println(Krupa);
	}
}

public class Tesla extends Tesla1
{
 Tesla(String Shankar)
 {
	 super(Shankar);
	 System.out.println("Tesla is a child Constructor:");
	 System.out.println(Shankar);
 }
 public static void main(String[] args) 
 {
	 Tesla T=new Tesla("car");
	
}
}
