
public class MainClass
{
	public static void main(String[] args)
	{
		Bicycle myBi = new Bicycle("Red", 100);
		
		myBi.info();
		
		myBi.color = "yellow";
		myBi.info();
	}

}
