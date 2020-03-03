
public class Bicycle
{
	public String color;
	public int price;
	
	public Bicycle()
	{
		System.out.println("Bicycle Constructor1");
	}
	
	public Bicycle(String color_input, int price_input)
	{
		System.out.println("Bicycle Constructor2");
		color = color_input;
		price = price_input;
	}
	
	public void info()
	{
		System.out.println(" -- info() --");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
}
