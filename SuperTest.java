


public class superclass {
	int a=10;
	public void display()
	{
		System.out.print("This is the super class");
	}
	

}
public class subclass extends superclass
{ int a=22;
	public void display() {
	System.out.print("This is the sub class");
	}	
	public void mymethod()
	{
		subclass sub=new subclass();
	sub.display();
	super.display();
	System.out.println("In sub class"+sub.a);
	System.out.println("IN SUPER class"+super.a);
	}
	
	public static void main(String[] args)
	{
		subclass obj=new subclass();
		obj.mymethod();
	}

}

