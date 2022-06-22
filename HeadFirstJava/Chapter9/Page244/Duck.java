class Duck{

	int size;

	public static void main(String[] args){

		Duck d = new Duck(42);
		System.out.println(d.size);
	}

	public Duck(int duckSize){
		System.out.println("Quack");
		size=duckSize;
	}
}
