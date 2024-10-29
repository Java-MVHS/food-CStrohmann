// Calvin Strohmann
// 10-23-24  -  Wednesday
// Food.java

//ABSENT ON 10-25-24  -  Friday

/* 
 * This program is the parent class for Pizza.java, which is the parent class for DeepDishPizza.java.
 * This program works with FoodTester.java, which uses this class, Pizza.java, and DeepDishPizza.java
 * to create a virtual baking sale
 * 
 * Working on: Using inheritance to write subclasses, using super and extends
*/


public class Food
{
	protected String str;	//New protected field variable that can be used in subclasses
	
	public Food ()			//Food Constructor
	{
		str = new String("");	//Initializes field variable
	}
	
	public Food (String prepMethod, String ingredient, String name)		//Overloaded Constructor
	{	
		str = "At the sale: " + name + " " + prepMethod + " with " + ingredient;	//Set the value for str
	}

	public void printForSale()		//Creates printForSale method
	{
		System.out.println(str);	//Prints out str
	}
}
