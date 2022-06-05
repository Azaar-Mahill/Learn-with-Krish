//Eager initialization
class EagerInitialization{
	public static void main(String[] args){
		Abc obj1 = Abc.getInstance();
		Abc obj2 = Abc.getInstance();
	}
}

class Abc{
	static Abc obj = new Abc();
	private Abc(){
		System.out.println("Instance created");

	}
	public static Abc getInstance(){
		return obj;
	}
}