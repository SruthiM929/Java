package package1;
//this keyword
public class Global_Localprogram 
{
 String name;
 double salary;
 int age;
 void student(String name,double salary, int age)
 {
	 this.name=name;
	 this.salary=salary;
	 this.age=age;
	 System.out.println("My name is:" +name);
	 System.out.println("My salary is:" +salary);
	 System.out.println("My age is:" +age);
 }
public static void main (String[] args)
{
	Global_Localprogram g=new Global_Localprogram();
	g.student("sita",30000,29);
	System.out.println(g.name);
	System.out.println(g.salary);
	System.out.println(g.age);
}
}