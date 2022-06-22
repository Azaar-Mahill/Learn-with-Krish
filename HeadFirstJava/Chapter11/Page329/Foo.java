class Foo{
	public static void main(String[] args){
		Foo.go();
	}

	public static void go(){
		Laundry l = new Laundry();

		try{
			l.doLaundry();
		}catch(PantsException pex){
			System.out.println("PantsException");
		}catch(LingreException lex){
			System.out.println("LingreException");
		}
	}
}

class Laundry{

	public void doLaundry() throws PantsException, LingreException{
		int number=0;
		if(number==0){
			throw new PantsException();
		}else{
			throw new LingreException();
		}
	}
}

