package FiguraGeometrica;

public abstract class FiguraGeometrica
{
	public abstract double area();

	public void imprimirArea()
	{
		System.out.println("El area es: "+area());
	}
}
