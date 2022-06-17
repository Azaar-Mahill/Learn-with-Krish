class TestStuff{

	public static void main(String[] args){

		int z=7;
		TestStuff t = new TestStuff();
		t.go(z);
		System.out.println("Z check "+z);

	}

	void go(int z){

		z = 0;
		System.out.println("Z in method "+z);
	}
}