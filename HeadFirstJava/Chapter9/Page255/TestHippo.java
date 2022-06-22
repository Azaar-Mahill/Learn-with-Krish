class TestHippo{

	public static void main(String[] args){

		System.out.println("Starting....");
		Hippo h = new Hippo("Buffy");
		System.out.println(h.getName());
	}

}

class Animal{

	private String name;

	public String getName(){
		return name;
	}

	public Animal(String theName){
		name=theName;
	}
}

class Hippo extends Animal{

	public Hippo(String name){
		super(name);
		System.out.println("Making a Hippo");
	}
}
