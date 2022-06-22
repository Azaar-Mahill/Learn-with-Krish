class Test{

	public static void main(String[] args){
		
		Test t = new Test();
		t.Equals();
		t.GetClass();
		t.HashCode();
		t.ToString();
	}

	public void Equals(){

		Dog a = new Dog();
		Cat c = new Cat();

		if(a.equals(c)){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}

	public void GetClass(){
		Cat c = new Cat();
		System.out.println(c.getClass());		
	}

	public void HashCode(){
		Cat c = new Cat();
		System.out.println(c.hashCode());
	}

	public void ToString(){
		Cat c = new Cat();
		System.out.println(c.toString());
	}
}

class Dog{

}

class Cat{

}