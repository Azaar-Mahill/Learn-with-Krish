//Enum
//comes after JAVA 1.5
//Enum is a special type of class
//have private constructor already

class Enum{
	public static void main(String[] args){
		Abc obj1 = Abc.INSTANCE;
		obj1.i = 5;
		obj1.show();

		Abc obj2 = Abc.INSTANCE;
		obj2.i = 6;
		obj2.show();

		obj1.show();
		
		obj1.i = obj1.i -4;
		obj1.show();
	}
}

enum Abc{
	INSTANCE;
	int i;
	public void show(){
		System.out.println(i);
	}
}
