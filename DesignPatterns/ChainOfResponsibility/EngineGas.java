public class EngineGas implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain){
		this.nextInChain = nextChain;
	}

	@Override
	public void repair(Operations request){
		if (request.getRepWanted() == "engine"){
			System.out.println("Start repairing engine");
		}else if (request.getRepWanted() == "gas"){
			System.out.println("Start gas tank");
		}else{
			nextInChain.repair(request);
		}
	}
}