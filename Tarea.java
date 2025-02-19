// 1/2 *b*h

public class Tarea{

public int breath;
public int height;


public Tarea(int breath , int height){


	this.breath=breath;
	this.height=height;
}
public void display(){
System.out.println(1/2*( breath * height));
}
	public static void main (String [] args){

	Tarea area = new Tarea(3,4);
	area.display();
}
}
