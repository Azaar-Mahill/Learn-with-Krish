class Test{

	public static void main(String[] args){

		/*Pet p=new Pet();
		p.beFriendly();*/
		Dog D = new Dog();
		D.roam();
		D.beFriendly();
	}

}

interface Pet{

	public abstract void beFriendly();
	public abstract void play();
}

abstract class Canine{

	public void roam(){
		System.out.println("Roam Canine");
	}
	public void eat(){
		System.out.println("eat Canine");
	}	
}

class Dog extends Canine implements Pet{

	public void beFriendly(){
		System.out.println("Friendly");
	}
	public void play(){
		System.out.println("play");
	}

	public void roam(){
		System.out.println("Roam");
	}
	public void eat(){
		System.out.println("eat");
	}	
}