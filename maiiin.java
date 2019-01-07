//Mary Guierrez 
// OBJ oriented PROJECT 2 
//Vending Maching

package vmv2;
import java.util.Scanner;
public class maiiin {
	static Scanner in= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Displays the Menu
		sssss menu= new sssss();
		
		//Selects item
		selectItem choice = new selectItem();
		
		//calling money class
		money pay= new money();
		
		//user snack choice
		int itemNumber=0;
		
		double finalTotal=0;
	
	do {
		//displays the vending machine menu
		menu.displayMenu();
		
		//takes the users input on how many coins they are putting in
		finalTotal= pay.insertMoney();
		
		System.out.print("Select a snack \n");
		
		menu.displayMenu();
		
		itemNumber= in.nextInt();//takes item number input
		
		//Checks if it is in stock
		choice.theStock(itemNumber);
			
		//calculates the change
		pay.Calculate(itemNumber, finalTotal);
		
		System.out.println("Ready, please take your change \n ");

				
		System.out.println("\nThank You, Come Again \n\n");

		
	} while(itemNumber==1||itemNumber==2||itemNumber==3||itemNumber==4);
	System.exit(0);
	
}


}