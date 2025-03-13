package package1;
//multi level inheritance
interface Tab1
{
	void method1();
	void method2();
}
interface Tab2 extends Tab1
{
	void method3();
	void method4();
}
public class Google_Class implements Tab2
{
	public static void main(String[] args)
	{
		Google_Class g=new Google_Class();
		g.method1();
		g.method2();
		g.method3();
		g.method4();
	}
	public void method1() {
	System.out.println("method1 implementation");
		
	}
	public void method2() {
		System.out.println("method2 implementation");
		
	}
	public void method3() {
		System.out.println("method3 implementation");
		
	}
	public void method4() {
		System.out.println("method4 implementation");	
		
	}

}
