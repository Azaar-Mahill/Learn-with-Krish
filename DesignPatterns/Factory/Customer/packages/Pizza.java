//Instance of receptionInterface
package Customer.packages;

public class Pizza implements receptionInterface{
	@Override
	public void order(){
		System.out.println("You ordered pizza");
	}
}