class Duck{

	int size;

	public static void main(String[] args){

		//Duck d = new Duck(42);
		Duck d = new Duck();
		System.out.println(d.size);
	}

	public Duck(){
		System.out.println("Quack1");
		size=24;
	}

	public Duck(int duckSize){
		System.out.println("Quack2");
		size=duckSize;
	}
}
