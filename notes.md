
##class 
	properties
	methods/behaviours
	constructors

##oop principal

	#Inheritance
	Inheritance is an important pillar of OOP (object oriented programming) it is 
	the mechanism in java by which one class is allow to inherite the features (fields and methods) of another calss .


	#Polymorphism (over write/over loading)(name save but work different)
	polymorphism is java is a concept by which we can peerform a single action in
	different ways.polymorphism is derived from 2 greek words:paly and morphs.the word "poly" means many and "morphs" forms. so ploymorphism many forms 
	there are two tpyes of polymorphism in java :compile-time polymorphism and runtime polymorphism .we can perform polymorphism in java by method overloading {compile time} and method overloading {runtime}

	#Abstraction
	Abstraction is a** process of hiding** the implementation details from the 
	user only the fuctionlity will be provided to the user.in other wors, the user will have the information on what the object does instead of how it does it. in java , abstraction is achieved using Abstract classes and interfaces 
    #Encapsulaste (source )
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


