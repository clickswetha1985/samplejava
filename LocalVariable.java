package sample;

public class LocalVariable {
	public int put;
	public void putAge() {
		int age = 0; //local variable
        age = age + 6;
        System.out.println("Dog age is : " + age);
	}
	
	public int area()
    {
		
        int length=10; //local variable
        int breadth = 5; //local variable
        int rectarea = length*breadth; //local variable
        return rectarea;
        
        }

	public static void main(String[] args) {
		LocalVariable d = new LocalVariable();
		System.out.println(d.area()); //print 50
		d.putAge(); //

	}

}
