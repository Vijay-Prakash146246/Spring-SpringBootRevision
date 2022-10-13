package Com.masai;

public class Runner 
{
	public static void main(String[]args)
	{
		DrawShape d = new DrawShape(new circle());
		d.drawShape();
		
		System.out.println("\n+++++++++++++++++++++++++++++++++++\n");
		
		DrawShape d1 = new DrawShape();
		d1.setD(new triangle());
		d1.drawShape();
	}
}
