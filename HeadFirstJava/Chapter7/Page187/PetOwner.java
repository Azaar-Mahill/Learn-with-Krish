class PetOwner{

	public static void main(String[] args){

		Vet v = new Vet();
		Dog d = new Dog();
		Hippo h= new Hippo();
		v.giveShot(d);
		v.giveShot(h);
	}
}

class Vet{

	public void giveShot(Animal a){

		a.makeNoise();
	}
}

class Animal{

	public void makeNoise(){
		System.out.println("deee dee");
	}
}

class Dog extends Animal{

	public void makeNoise(){
		System.out.println("Ruff Ruff");
	}
}

class Hippo extends Animal{

	public void makeNoise(){
		System.out.println("Ooo Oo");
	}
}