class TestHippo{

	int size;

	public static void main(String[] args){

		System.out.println("Starting....");
		Hippo h = new Hippo();
	}

}

class Animal{

	public Animal(){
		System.out.println("Making an animal");
	}
}

class Hippo extends Animal{

	public Hippo(){
		System.out.println("Making a Hippo");
	}
}
