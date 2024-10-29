// Calvin Strohmann
// 10-23-24  -  Wednesday
// Food3.java

//ABSENT ON 10-25-24  -  Friday

/* 
 * This program is the parent class for Pizza3.java, which is the parent class for DeepDishPizza3.java.
 * This program works with FoodTester3.java, which uses this class, Pizza3.java, and DeepDishPizza3.java
 * to create a virtual baking sale
 * 
 * Working on: Using inheritance to write subclasses, using super and extends
*/

/*
 * Food3.java
 * This program will modify Food.java and subclasses to include the properties number of pieces and
 * cost per piece, and the output for FoodTester3.java will be changed as well.
 */


public class Food3
{
	protected String str;		//New protected field variable that can be used in subclasses
	
	public Food3 ()			//Food3 Constructor
	{
		str = new String("");	//Initializes field variable
	}
	
	public Food3 (String prepMethod, String ingredient, String name, int pieces, double pieceCost)		//Overloaded Constructor
	{	
		int centPieceCost = (int) (100 * pieceCost);								//Changes a cost in dollars to a cost in cents
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient + 
			  " will be sold for " + centPieceCost + " cents each. With " + pieces + 
			  " " + name + ", $"+String.format("%.2f", pieces*pieceCost)+" can be made.";						//Sets the value for str
	}

	public void printForSale()		//Creates printForSale method
	{
		System.out.println(str);	//Prints out str
	}
}
