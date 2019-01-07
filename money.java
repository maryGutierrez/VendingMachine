package vmv2;

import java.util.Scanner;
//Money class deals with all the money handling depending on the user choice

public class money {
	static Scanner in= new Scanner(System.in);
	
	int  total=0;
	int Value;
	
	final double qValue = .25;
	final double dvalue = .10;
	final double nVaule = .05;
	final double pValue = .01;
	
	
	double finalTotal=0;
	
double insertMoney(){
	//declaring the coin variables
	int quarters=0;
	int dimes=0;
	int nickels=0;
	int pennies=0;
	
		
	do {
	
		System.out.print("\nInsert coins \n");
		System.out.print("1. Quarter\n");
		System.out.print("2. Dime\n");
		System.out.print("3. Nickle\n");
		System.out.print("4. Pennies\n");
		System.out.println("5. DONE inserting coins\n");
	
		Value = in.nextInt();
		
		if(Value == 1)
		{
			quarters++;
		}
		if(Value == 2)
		{
			dimes++;
		}
		if(Value == 3)
		{
			nickels++;
		}
		if(Value == 4)
		{
			pennies++;
		}
	
		}while(Value != 5);
	
	finalTotal = (quarters*qValue) + (dimes*dvalue)+(nickels*nVaule)+(pennies*Value);
	
	System.out.print("your balance is $ "+ finalTotal+"\n");
		
		return finalTotal;
	}
	
	//calculate function makes sure the user has enough money to purchase
	double Calculate(int itemNumber, double finalTotal)
	{
		//price of the items 
		double Hotcheetos = .75;
		double Pistachios = 2.5;
		double MilkChocolate =.10;
		double Pretzels = 1.50;
		double theChange=0;
		if(itemNumber==1)
		{
			theChange = finalTotal-Hotcheetos;  
			if(finalTotal<Hotcheetos)
			   {
				   System.out.print("insuficient funds\n");
			   }
		  
		}
		if(itemNumber==2)
		{
			 theChange = finalTotal-finalTotal ;   
			if(finalTotal<Pistachios)
			   {
				   System.out.print("insuficient funds\n");
			   }
			   
		  
		}
		if(itemNumber==3)
		{
			theChange =finalTotal-MilkChocolate;   
			if(finalTotal<MilkChocolate)
			   {
				   System.out.println("insuficient funds");
			   }
			   
		   
		}
		if(itemNumber==4)
		{
		   theChange = finalTotal- Pretzels;
			if(finalTotal<Pretzels)
			   {
				   System.out.println("insuficient funds");
			   }
			   
		}
		
		//displays the change amount only if the customer has enough money
		if(theChange>0)
		{
			System.out.println("your Change is $" + theChange);
		}
		
		return theChange;
	}

}
