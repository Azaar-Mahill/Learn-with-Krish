class MakeCanine{

	public static void main(String[] args){
		Canine c;
		int number=0;
		if(number==0){
			c=new Dog();
			c.roam();
		}else{
			c = new Canine();
			c.roam();
		}



	}
}

abstract class Animal{

}

abstract class Canine extends Animal{

	public void roam(){
		System.out.println("Roam");
	}
}

class Dog extends Canine{

	public void roam(){
		System.out.println("Roam as a Dog");
	}
}