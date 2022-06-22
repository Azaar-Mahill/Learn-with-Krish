import java.util.*;

class Test{

	public static void main(String[] args){
		
		ArrayList<Dog> myDogArrayList = new ArrayList<Dog>();
		Dog aDog = new Dog();
		myDogArrayList.add(aDog);
		Dog d = myDogArrayList.get(0);
		System.out.println("A");

		/*
		ArrayList<Object> myDogArrayList2 = new ArrayList<Object>();
		Dog a2Dog = new Dog();
		myDogArrayList2.add(aDog);
		Dog d2 = myDogArrayList.get(0);//comes out as object so need to convert to dog
		*/

		ArrayList<Object> myDogArrayList3 = new ArrayList<Object>();
		Dog a3Dog = new Dog();
		myDogArrayList3.add(aDog);
		//Dog d3 = (Dog)myDogArrayList.get(0);//method1-using (Dog) converts to Dog

		if((Dog)myDogArrayList.get(0) instanceof Dog){//method2-using instanceof
			System.out.println("B");	
			Dog d3 = (Dog)myDogArrayList.get(0);	
		}
	}


}

class Dog{

}

class Cat{

}