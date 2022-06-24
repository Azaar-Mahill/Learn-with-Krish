import java.util.*;

class TestGenerics1{

	public static void main(String[] args){
		new TestGenerics1().go();
	}

	public void go(){
		ArrayList<Dog> dog = new ArrayList<Dog>();
		dog.add(new Dog());
		dog.add(new Animal());
		dog.add(new Dog());
		takeAnimals(dog);
	}

	public void takeAnimals(ArrayList<? extends Animal> animals){
		for(Animal a: animals){
			a.eat();
		}
	}
}

abstract class Animal{
	void eat(){
		System.out.println("animal eating");
	}
}

class Dog extends Animal{
	void bark(){}
}

class Cat extends Animal{
	void meow(){}
}