package ie.tudublin;
import c21320836.EliVisual;

public class Main
{

	public static void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new EliVisual());
    }

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();	
	}
	
}