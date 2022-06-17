class DogTestDrive{

	public static void main(String[] args){

		Dog one = new Dog();
		one.bark(3);
		Dog two = new Dog();
		two.bark(2);
		Dog three = new Dog();
		three.bark(1);
	}
}

class Dog{

	void bark(int numOfBarks){

		while(numOfBarks>0){
			System.out.println("ruff! ruff!");
			numOfBarks=numOfBarks-1;
		}
	}
}
