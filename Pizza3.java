// Calvin Strohmann
// 10-23-24  -  Wednesday
// Pizza3.java

//ABSENT ON 10-25-24  -  Friday

public class Pizza3 extends Food3 //This creates a subclass called Pizza3 of the class Food3 
{	
	public Pizza3(String ingredient, int pieces, double pieceCost) 			//This creates a constructor for the Pizza3 class
	{	
		super("baked", ingredient, "pizza", pieces, pieceCost);			//Calls the constructor from the superclass
	}
	
	public Pizza3(String ingredient, String name, int pieces, double pieceCost)//Overloading constructor(creating a second one) for DeepDishPizza3.java to use
	{
		super("baked", ingredient, name, pieces, pieceCost);			//Calls the constructor from the superclass again
	}
}

