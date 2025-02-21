
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

	Inheritance ->
	Inheritance is an important pillar of OOP (object oriented programming) it is 
	the mechanism in java by which one class is allow to inherite the features (fields and methods) of another calss .

	#Polymorphism (over write/over loading)(name save but work different) --->
	polymorphism is java is a concept by which we can peerform a single action in
	different ways.polymorphism is derived from 2 greek words:paly and morphs.the word "poly" means many and "morphs" forms. so ploymorphism many forms 
	there are two tpyes of polymorphism in java :compile-time polymorphism and runtime polymorphism .we can perform polymorphism in java by method overloading {compile time} and method overloading {runtime}

	#Abstraction -->
	Abstraction is a** process of hiding** the implementation details from the 
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


