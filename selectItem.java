package vmv2;

public class selectItem {
//Select item class takes care of making the right computation depending on the 
//snack selected by the user
	
	int CheetosInventory = 2; //amount of hotchettos in the vending machine
	int pistacioInventory=4;	//amount of pistachio in the vending maching
	int MilkChocolateInventory=2; /// milk chocolate amount
	int pretzelsInventory =1; //pretzels

	void theStock(int itemNumber) //Checks the Inventory based on user selection
	{

		if(itemNumber==1)
		{
			if (CheetosInventory == 0)
			{
				System.out.print("Out of Stock, Make another selection\n\n");
				
			}
			CheetosInventory--;	
		}

		
		if(itemNumber==2)
		{
			if (pistacioInventory== 0)
			{
				System.out.print("Out of Stock, Make another selection\n\n");
				
			}
			pistacioInventory--;

		}
		
		if(itemNumber==3)
		{
			if (MilkChocolateInventory == 0)
			{
				System.out.print("Out of Stock, Make another selection\n\n");
				
			}
			MilkChocolateInventory--;

		}
		if(itemNumber==4)
		{
			if (CheetosInventory == 0)
			{
				System.out.print("Out of Stock, Make another selection\n\n");
				
			}
			pretzelsInventory--;

		}
		if(CheetosInventory==0 && pistacioInventory==0&& MilkChocolateInventory==0&&pretzelsInventory==0)
		{
			System.out.print("\n SOLD OUT! come back later");
		}
		
	}
	
}
