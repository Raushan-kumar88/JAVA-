import java.util.*;
class student
{
	String name;
	int id;
	void insert(String n,int i)
	{
	   name=n;
	   id=i;
	}
	void display()
	{
		System.out.println(name+" "+id);
	}
}
class A
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:-");
		String name=sc.nextLine();
		System.out.println("enter your id:-");
		int id=sc.nextInt();
		
		student obj1=new student();
		//obj1.insert("Raushan kumar",125);
		obj1.insert(name,id);
		obj1.display();
	}
}