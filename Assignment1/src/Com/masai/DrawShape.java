package Com.masai;

public class DrawShape 
{
	Draw d;

	//Setter injection
	public void setD(Draw d) 
	{
		this.d = d;
	}
     //Constructor injection 
	public DrawShape(Draw d) 
	{
		this.d = d;
	}

	public DrawShape() 
	{
		
	}
	
	public void drawShape()
	{
		
		System.out.println("We are calling your draw() method");
		d.draw() ;
	}
}
