class PlayerTestDrive{

	public static void main(String[] args){

		System.out.println(Player.playCount);
		Player one = new Player("Tiger Woods");
		System.out.println(Player.playCount);
		Player two = new Player("Mike Tyson");
		System.out.println(Player.playCount);
	}
}

class Player{

	static int playCount=0;
	private String name;
	public Player(String n){
		name=n;
		playCount++;
	}
}