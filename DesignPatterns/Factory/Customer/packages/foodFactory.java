//resposible of operation of instances
package Customer.packages;

public class foodFactory {
	
	public receptionInterface getInstance(String str) {
		if(str.equals("Pizza"))
			return new Pizza();
		else if(str.equals("Biriyani"))
			return new Biriyani();
		else
			return new Pasta();

	}

}
