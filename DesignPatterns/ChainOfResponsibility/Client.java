public class Client {
	public static void main(String[] args){
		Chain chainRep1 = new TyreSuspensionBrakes();
		Chain chainRep2 = new EngineGas();
		Chain chainRep3 = new SeatsACSteer();
		Chain chainRep4 = new BodyLights();

		chainRep1.setNextChain(chainRep2);
		chainRep2.setNextChain(chainRep3);
		chainRep3.setNextChain(chainRep4);
		
		//tyre , suspension , brakes, engine , gas , seats , ac , steer , body , light
		Operations request = new Operations("light");

		chainRep1.repair(request);

	}
}