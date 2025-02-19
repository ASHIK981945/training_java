public class Volume{

// global varible
public int length;
public int breath;
public int height;

// global and local varible is same variable we can {use this}

	public Volume (int length , int b , int h){
// local varible
	this.length =length;  
	breath =b;
	height =h;
}
public void display()
{
//display 
System.out.println(length * breath * height); //->sign 
}

	public static void main(String[] args){


        // assigning values to attributes
Volume myvolumne = new Volume(2,3,4);

   // calling methods an object
myvolumne.display();

}

}