class Test{
	// this is global scope
	int a = 10;
	int b=3;
	int c;
	int c1;
	int r;
	String name = "Raushan kumar";
	
	//Ques.... if send no negative to number is positive if no is positive the no is positive
	
	int n1;
	void Number(int n){
		n1=n;
		if(n1<0){
			 n1 = Math.abs(n1);
			
			System.out.println("positive no : "+n1);
		}
		else if(n1>0){
			System.out.println("positive no : "+n1);
		}
		
	}
	
	//here to find simple interest----------------
	
	int p,q,t;
	float result;
	void Simpleinterest(int p1,int q1,int r1){
		p=p1;
		q=q1;
		t=r1;
		
	}
	void Simpleinterestper(){
		result=(p*r*t)/100;
		
	}
	void Simpleinterestso(){
		System.out.println("The simple interest : "+result);
	}
	
	
	
	
	void show(){
		System.out.println("Id = "+a+ " ->  Name = "+ name);
	}
	
	void display(int p){
		r=p;	//here initilize of global variable..
	}
	
	void display1(){
		System.out.println(""); // here print global variable..
		
	}
	void add(){
		c=a+b;
		/*
		
		this is local variable
		
		int d; // when be run then compile time error
		System.out.println(d);
		*/
		 
		System.out.println("the sum of a and b : "+c1);
		System.out.println("-------------------------------------------------------");
		
	}
	
	//-------------------------------------------------------
	//here create Constructor
	Test(int n){
		c1=n;
		System.out.println("this is constructor"+c1);
	}
	
	Test(){
		System.out.println("The value of c1"+c1);
	}
	
	
	//String name;
	int id;
	
	static String C_name="TCS";
}


		


class Raus{
	
	
	public static void main(String[] args){
		System.out.println("hello Java");
		
		//note :- Public :- It is a Access modifier
		//Static :- without create object we can easily call.
		//Void :- Why we use void in Main method ?
		// Ans :- 
		// String :- It is class 
		//[] :- It is Array with 0 length value\\
		
		//Object : - That has some types of behaviour And properties.
		//Class :- It is classification or container which contains those object which have similar type of properties and behaviour.
		// The Property and behaviour of an object are tightly coupled to each other . The behaviour of an object can change the property of an object.
		// On the basis of oops two types of language of there.
		// 1. Object based language( the language do not follow run time polymorphism and Inheritance are called the object based language.)
		// eg :- Javascript 
		// OOPS :- those language are strictly follow 2 rules of oops run time polymorphism and inheritance 
		// eg:- Java,c++,python,.net 
		// object is created in heap area at runtime.
		//(.) :- dot operator is a association properties.
		
		
		
		/*
		todya of class 18-02-2023 Pro.Sahil
		features of oops
		1.object
		2.class
		3.Inheritanc
		4.DataAbstration
		5.Polymorphism
		6.Incapsulation
		-------------------------------------------------
		Object :- object have three Attributes Identity(id),state(visibility),behaviour.
		
		how to create object?
		java have four method
		1.using new keyword
		2.using Cloneable Interface 
		3.using newInstance variable
		4.using factorizition
		
		eg.pizza variable_name=new pizza();
		
		JVM divide variable into 5 types
		1.class Area
		2.stack
		3.Heap
		4.Pc registor
		5.native method stack
		--------------------------------------------
		class :- class is the blue-print of an object
		
		syntax of class------
		class class_name{
			data member (variable);
			member fucntion (method);
			
		}; --> here is ";" is optional
		-------------------------------------------
		syntax of method
		return_type function_name
		{
			
			inserted code here
		}
		
		
		------------------------------------------
		public static void main(String a[])
		or,
		public static void main(String...a) 
		explain :-
		------------------------------------------
		difference between local and global variable....
		
		
		---------------------------------------
		Method overloading :-
		It means method is same and arguments is different
		ex:-
		void show(int a){
			
		}
		void show(char a){
			
		}
		
		void show(int a,long a){
			
		}
		void show(long a,int b){
			
		}
		t.show(10,20) when be call show method here is ambigutative error here compiler
		
		
		---------------------------------------
		main method can be overload or not 
		Yes
		
		
		--------------------------------------------
		Constructor:-
		Constructor is the special type of fucntion
		Constructor has two types 
		1. no parametrize constructor
		2. parametrize constructor
		
		1.no parametrize constructor(default constructor):-
		Test(){
			
		}
		2.Parametrize constructor :-
		ex :-
		Test(int n){
			
		}
		-------------------------------------------------------
		constructor overloading 
		Test(int n){
			
		}
		Test(char n){
			
		}
		--------------------------------------------------------
		** constructor returns current class object reference that is called 'this'.
		'this' is a key word. this holds the reference id of current object.
		
		--------------------------------------------------------
		There are two types of variable 
		1.Instance variable
		2.static
		
		static keyword :-
		static variable call in the class 
		static variable call in the outside of the class
		'class_name.static_variable_name'
		
		
		*/
		
		
		
		
		Test t= new Test(10);
		Test t1= new Test();
		t.show();
		t.add();
		
		t.display(222);
		t.display1();
		t.Number(-20);
		t.Simpleinterest(200,3,4);
		t.Simpleinterestper();
		t.Simpleinterestso();
		
	}
}