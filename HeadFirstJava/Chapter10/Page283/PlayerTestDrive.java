class PlayerTestDrive{

	public static void main(String[] args){

		//System.out.println(Player.playCount);
		Player one = new Player("Tiger Woods");
		System.out.println(one.playCount);
		System.out.println(Player.k);
		Player two = new Player("Mike Tyson");
		System.out.println(two.playCount);
		System.out.println(Player.k);
	}
}

class Player{

	final int playCount=0;
	public static final int k=1000;
	private String name;
	public Player(String n){
		name=n;
		//playCount++;
	}
}