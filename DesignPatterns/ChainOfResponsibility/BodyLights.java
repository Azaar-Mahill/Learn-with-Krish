public class BodyLights implements Chain{
	private Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain){
		this.nextInChain = nextChain;
	}

	@Override
	public void repair(Operations request){
		if (request.getRepWanted() == "body"){
			System.out.println("Start repairing body");
		}else if (request.getRepWanted() == "light"){
			System.out.println("Start repairing lighting system");
		}else{
			System.out.println("Cannot find");
		}
	}
}