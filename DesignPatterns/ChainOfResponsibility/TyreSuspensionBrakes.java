public class TyreSuspensionBrakes implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain){
		this.nextInChain = nextChain;
	}

	@Override
	public void repair(Operations request){
		if (request.getRepWanted() == "tyre"){
			System.out.println("Start repairing tyres");
		}else if (request.getRepWanted() == "suspension"){
			System.out.println("Start suspension system");
		}else if (request.getRepWanted() == "brakes"){
			System.out.println("Start brakes");
		}else{
			nextInChain.repair(request);
		}
	}
}