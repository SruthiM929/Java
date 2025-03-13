package package1;
interface one
{
	void method1();
	void method2();

}
interface two
{
	void method3();
	void method4();
}
public class Google_Multiple implements one,two
{
public static void main(String[] args) 
{
	Google_Multiple g=new Google_Multiple();
	g.method1();
	g.method2();
	g.method3();
	g.method4();
}
public void method3() {
	System.out.println("method4 implementation");
	
}
public void method4() {
	System.out.println("method3 implementation");
	
}
public void method1() {
	System.out.println("method1 implementation");
}
public void method2() {
	System.out.println("method2 implementation");
}
}
