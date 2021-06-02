package FiguraGeometrica;

public class Triangulo extends FiguraGeometrica
{
	private int base;
	private int altura;
	
	public Triangulo(int b,int h)
	{
		base = b;
		altura = h;
	}

	@Override
	public double area()
	{
		return base*altura/2;
	}
}
