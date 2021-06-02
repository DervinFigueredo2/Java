package FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica
{
	private int base;
	private int altura;
	
	public Rectangulo(int b,int h)
	{
		base = b;
		altura = h;
	}

	@Override
	public double area()
	{
		return base*altura;
	}
}
