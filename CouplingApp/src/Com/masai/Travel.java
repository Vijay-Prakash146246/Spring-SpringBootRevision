package Com.masai;
//Dependent class
public class Travel 
{
	Car c = new Car();
	Bike b = new Bike();
	public void journey()
	{
		c.start();
		System.out.println("Journey started.....");
		b.ride();
	}
	public static void main(String[]args)
	{
		Travel t = new Travel();
		t.journey();
	}
}
