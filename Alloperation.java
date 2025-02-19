public class Alloperation {

	public Alloperation()
{}

public void displayMsy(int firstnum , int secondnum){
	System.out.println("Add:" + firstnum + secondnum);
	System.out.println("Sub:" +(firstnum - secondnum));
	System.out.println("Mult:"+firstnum * secondnum);
	System.out.println("Div:"+firstnum / secondnum);

}


public static void main(String args[]){
	Alloperation myadd = new Alloperation();
	myadd.displayMsy(2 ,3);
}
}