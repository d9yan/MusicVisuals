package ie.tudublin;

import c21320836.EliVisual;
import c21308733.*;
import C21385263.yanVisual;

public class Main
{
	/* 
	public void yanVisual()
	{
		String[] a = {"MAIN"};
		processing.core.PApplet.runSketch( a, new yanVisual());	
	}
	*/

	public void startUI()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new EliVisual());		
	}

	public static void main(String[] args)
	{
		Main main = new Main();
		main.startUI();
		//main.yanVisual();			
	}
	
}