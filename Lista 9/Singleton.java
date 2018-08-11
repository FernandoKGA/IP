public class Singleton {   //By Norton T. Roman
private static Singleton copia = new Singleton();
private Singleton() {}
	public static Singleton copia()
	{
		return copia;
	}
}
