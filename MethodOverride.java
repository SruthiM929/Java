package package1;
//Methodoverriding & super,final overriding

class Firefox
{
	final void login()
	{
		System.out.println("Login with gmail using mobile no");
	}
}

public class MethodOverride extends Firefox 
{
	void login_with_emailid()
	{
		System.out.println("Login with gmail using username");
		//super.login();
	}
 public static void main(String[] args)
 {
	MethodOverride m=new MethodOverride();
	m.login();
	//m.login();//
}
}
