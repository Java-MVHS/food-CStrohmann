// Calvin Strohmann
// 10-23-24  -  Wednesday
// FoodTester3.java

//ABSENT ON 10-25-24  -  Friday

public class FoodTester3
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n");
		Food3 food1 = new Food3 ("baked", "bananas", "muffins", 12, 0.50);	//Creates a new Food3 object called food1
		food1.printForSale();									//Calls the printForSale function for food1
		Food3 food2 = new Food3 ("fried", "yams", "fritters", 3, 1.00);	//Creates a new Food3 object called food2
		food2.printForSale();									//Calls the printForSale function for food2
		Pizza3 pizza = new Pizza3 ("pepperoni", 8, 2.50);					//Creates a new Pizza3 object called pizza
		pizza.printForSale();									//Calls the printForSale function for pizza
		System.out.print("\n\n\n");
	}
}


