public class SeatsACSteer implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain){
		this.nextInChain = nextChain;
	}

	@Override
	public void repair(Operations request){
		if (request.getRepWanted() == "seats"){
			System.out.println("Start repairing seats");
		}else if (request.getRepWanted() == "ac"){
			System.out.println("Start repairing air conditioning system");
		}else if (request.getRepWanted() == "steering"){
			System.out.println("Start repairing steering system");
		}else{
			nextInChain.repair(request);
		}
	}
}