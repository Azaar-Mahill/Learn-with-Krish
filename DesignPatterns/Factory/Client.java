//Client Code

import Customer.packages.Pizza;
import Customer.packages.Biriyani;
import Customer.packages.Pasta;
import Customer.packages.foodFactory;
import Customer.packages.receptionInterface;

class Client{
	public static void main(String a[]){
		
		boolean wantPizza = true;
		boolean wantBiriyani = true;
		boolean wantPasta = false;

		if(wantPizza == true){
			foodFactory fF = new foodFactory();
			receptionInterface obj = fF.getInstance("Pizza");
			obj.order();
			
		}

		if(wantBiriyani == true){
			foodFactory fF = new foodFactory();
			receptionInterface obj = fF.getInstance("Biriyani");
			obj.order();
			
		}		

		if(wantPasta == true){
			foodFactory fF = new foodFactory();
			receptionInterface obj = fF.getInstance("Pasta");
			obj.order();
			
		}
		
		
	}
}