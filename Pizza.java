// Calvin Strohmann
// 10-23-24  -  Wednesday
// Pizza.java

//ABSENT ON 10-25-24  -  Friday


public class Pizza extends Food //This creates a subclass called Pizza of the class Food 
{	
	public Pizza(String ingredient) //This creates a constructor for the Pizza class
	{	
		super("baked", ingredient, "pizza");//Calls the constructor from the superclass
	}
	
	public Pizza(String ingredient, String name)//Overloading constructor(creating a second one) for DeepDishPizza.java to use
	{
		super("baked", ingredient, name);//Calls the constructor from the superclass again
	}
}


