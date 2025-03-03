
##class 
	properties ->
	The Properties class represents a persistent set of properties. The Properties can be saved to a stream or loaded from a stream. It belongs to java.util package. Properties define the following instance variable. This variable holds a default property list associated with a Properties object. 
	```c
	Properties p = new Properties();
	Properties p = new Properties(Properties propDefault);
	```

	methods/behaviours ->
	Behavior for a class of objects is defined as a list of messages that an instance of that class can respond to.
	
	Java Methods are blocks of code that perform a specific task. A method allows us to reuse code, improving both efficiency and organization. All methods in Java must belong to a class. Methods are similar to functions and expose the behavior of objects

```c
// Creating a method
// that prints a message
public class Method {
  
    // Method to print message
    public void printMessage() {
        System.out.println("Hello, Geeks!");
    }

    public static void main(String[] args) {
      
        // Create an instance of the Method class
        Method m = new Method();
        m.printMessage();  // Calling the method
    }
}
```
	constructors

oop principal / four main features of object oriented programming

	Inheritance ->(over write)
	
	 ( superclass (parent) - the class being inherited from)
	 
	 ( subclass (child) - the class that inherits from another class)

	Inheritance is an important pillar of OOP (object oriented programming) it is 
	the mechanism in java by which one class is allow to inherite the features (fields and methods) of another calss .
``c
class parent {  
	// super class
	public void displayA() 
	{
		System.out.("AAAAAA)
	}
	public void displayB()
	{
		System.outprintln();
	}
}
	// sub class
public class child extends parent{
	@override (over write )
	public void displayA()
	{
		System.out.println("AAA")
	}
		public void display AB(){
		super.displayA()
		super.displayB()
		this.displayA()
	}
}

```








	#Polymorphism
	(over write Overwriting refers to the process of replacing existing data with new information)
	 
	(over loading ->With method overloading, multiple methods can have the same name with different parameters)
	  
	(name save but work different)(having mutiple form) --->

	polymorphism is java is a concept by which we can peerform a single (int 2 or 3 double)action in
	different ways.polymorphism is derived from 2 greek words:paly and morphs.the word "poly" means many and "morphs" forms. so ploymorphism many forms 

	there are two tpyes of polymorphism in java :compile-time polymorphism and runtime polymorphism .we can perform polymorphism in java by method overloading {compile time} and method overloading {runtime}

```c
public class Polymorphism {

    // polymorphism : having multiple forms

    // method overloading
    // Example :
    // int add (int a , int b);
    // int add (int a, int b , int c);
    // int add (double a, double b);

    // program example

    int add(int a, int b) {
        return a + b;
    }

    // method overloded with 3 int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // methods overloading with 2 double types parameters
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // use object

        Polymorphism object = new Polymorphism();
        int result = object.add(45, 31);
        System.out.println("addition of two number:" + result);
        System.out.println("...............................");

        // use static
        // int result = add(0, 0);
        // System.out.println("addition of two number" + result);

        // use static
        int value = Polymorphism.add(2, 3, 4);
        System.out.println("addition of three number :" + value);
        System.out.println("...............................");

        // use object
        Polymorphism object1 = new Polymorphism();
        int resultdouble = object1.add(12, 12);
        System.out.println("addition of two number of double " + resultdouble);

    }

}
```
	#Abstraction -->

	Abstraction is a process of hiding the implementation details from the 
	user only the fuctionlity will be provided to the user.in other wors, the user will have the information on what the object does instead of how it does it. in java , abstraction is achieved using Abstract classes and interfaces 

```c
 public class Box{
	int l,b,h,vol;

	void getdata(){
		l = 10;
		b = 5;
		h = 2;
	}
	void calculate (){
		vol= l*b*h;
		System.out.println("volume of a box is :"+ vol);
	}
 }
	public static void main(String[] args){
		Box obj = new Box();
		obj.getdata();
		obj.calculate();

	}
```
    Encapsulaste (source ) -->

		Encapsulate in java is a mechanism of wrapping the  data (variables) and 
		code acting on the data (method) together as a single unit. in encapsulation, the variable of a class will be hidden from other class, add can be accessed only through the methods of thier current class .therefore,it is also known as data hiding
```c
Class Rectangle {


public int length; // all class variables 
public int breadth;

//Default constructor
public Rectangle ()
{
this.length = 0;
this.breath = 0;
}


//parameters constructor // this --> G variable 
public Rectangle (int length ,int breath){
this.lenght = length ;
this.breath = breath;
}


//method to calculate area

public void area()
{}

int result = length * breadth;
System.out.println(result);
}  
```


**take array size from user**
**//hit**
scanner scanner = new scanner(System.in)
SYstem.out.println();
int arrysize = scanner.nextInt();
take array data use;
display smallest number among them;


(this  /  super )
``c
class parent {
	public void displayA() 
	{
		System.out.("AAAAAA)
	}
	public void displayB()
	{
		System.outprintln();
	}
}
public class child extends parent{
	@override (over write )
	public void displayA()
	{
		System.out.println("AAA")
	}
		public void display AB(){
		super.displayA()
		super.displayB()
		this.displayA()
	}
}
```

```c
class parent {
	void add (int a , int b){
		system.out.println("addition result:" + (a+b))
	}
	void subtract(int a , int b){
		system.out.println("addition result:" + (a-b))
	}
}
 
pubic class child extends parent{
	void  add & subtract (int c ,int d){
		super.add(a,b); // no define
		super.add(c,d); // define
		super.subtract(c,d);
	}
	void divide (int c,int d){
		system.out.println("divided resulf:"+(c\d));
	}
	void AddSubtractDivide(int a ,int b){
		this.add&subtract(a,b);
		this.divide(a,b);
	}
}
```

main body ma

 child a = new child();
 int res = a.AddSubtractDivid();
 System.out.println(res);

