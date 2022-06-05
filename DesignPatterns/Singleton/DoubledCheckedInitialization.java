//Doubled check initialization
//check if object is null for two times
class DoubledCheckedInitialization{
	public static void main(String[] args){
		Thread t1 = new Thread(new Runnable(){
			public void run(){
				Abc obj1 = Abc.getInstance();
			}
		});
		Thread t2 = new Thread(new Runnable(){
			public void run(){
				Abc obj2 = Abc.getInstance();
			}
		});
		
		t1.start();
		t2.start();
	}
}

class Abc{
	static Abc obj = new Abc();
	private Abc(){
		System.out.println("Instance created");

	}
	public static Abc getInstance(){
		if(obj == null){//first check
			synchronized(Abc.class){
				if(obj == null){//second check
				obj = new Abc();
				}
			}
			
		}
		return obj;
	}
}