/*PROGRAM: Assignment 2 
 * AUTHOR: Leah Perry
 * Due Date: September 10, 2015
 * SUMMARY: Calculates profit information for stock interaction with 2% broker costs
 */

import java.util.Scanner; //allows use of Scanner

public class hw2_perry_leah {
	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in); 
		
		String name; //name of person buying and selling
		int sharesBought; //number of shares to buy
		double buyingPrice; //price at which shares are bought
		int sharesSold; //number of shares sold
		double sellingPrice; //price at which shares are sold
		double buyingBroker; //price broker receives from purchase
		double sellingBroker; //price broker receives from selling
		double profit;  //end profit
		
		System.out.println("Please enter your name: "); //print name prompt
		name = keyboard.nextLine(); //scans in user's name
		System.out.println("Enter the number of shares you want to purchase: ");//shares prompt
		sharesBought = keyboard.nextInt(); //scans in price
		System.out.println("Enter the purchace price: "); //price prompt
		buyingPrice = keyboard.nextDouble(); //scans in price
		System.out.println("Enter the number of shares you want to sell: ");//selling prompt
		sharesSold = keyboard.nextInt(); //scans in shares sold
		System.out.println("Enter the price you sell them at: ");//selling price prompt
		sellingPrice = keyboard.nextDouble(); //scans in selling price
		
		buyingPrice = buyingPrice * sharesBought; //calculates cost to buy
		sellingPrice = sellingPrice * sharesSold; //calculates profit when selling
		buyingBroker = ((buyingPrice)*0.02); //calculates broker cost for purchase
		sellingBroker = ((sellingPrice)*0.02); //calculates broker cost for selling
		profit = sellingPrice - buyingPrice - buyingBroker - sellingBroker; //calculates profit
		
		System.out.println(name + " has purchased " + sharesBought + " shares at a price of $" +
				buyingPrice + ". Paying the broker 2 percent for each transaction, " + name +
				" payed the broker $" +  buyingBroker + " to buy and $" + sellingBroker + 
				" to sell. So their profit is $" + profit + "."); //prints information
		
		keyboard.close(); //closes keyboard Scanner object to prevent memory leaks
	}	
}
