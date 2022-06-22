class Duck extends Animal{

	public static void main(String[] args){

		Duck d = new Duck();
		System.out.println("A");
	}

	public Duck(){
		super();
		System.out.println("B");
	}

}

class Animal{
	public Animal(){
		System.out.println("C");
	}
}
