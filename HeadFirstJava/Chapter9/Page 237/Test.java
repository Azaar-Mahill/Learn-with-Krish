class Test{

	public static void main(String[] args){

		Test t = new Test();
		t.doStuff();
	}

	public void doStuff(){
		boolean b = true;
		System.out.println(b);
		go(4);
		System.out.println(b);
	}

	public void go(int x){
		int z=x+24;
		System.out.println(z);
		crazy();
	}

	public void crazy(){
		char c = 'a';
		System.out.println(c);
	}
}
