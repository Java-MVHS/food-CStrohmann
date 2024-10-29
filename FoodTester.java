// Calvin Strohmann
// 10-23-24  -  Wednesday
// FoodTester.java

//ABSENT ON 10-25-24  -  Friday

public class FoodTester
{
	public static void main(String[] args)
	{
		System.out.print("\n\n\n");
		Food food1 = new Food ("baked", "bananas", "muffins");	//Creates a new Food object called food1
		food1.printForSale();									//Calls the printForSale function for food1
		Food food2 = new Food ("fried", "yams", "fritters");	//Creates a new Food object called food2
		food2.printForSale();									//Calls the printForSale function for food2
		Pizza pizza = new Pizza ("pepperoni");					//Creates a new Pizza object called pizza
		pizza.printForSale();									//Calls the printForSale function for pizza
		System.out.print("\n\n\n");
	}
}


