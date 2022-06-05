import java.util.concurrent.TimeUnit;
import java.util.Date;
class mySingletonProject{
	public static void main(String[] args){
		boolean platinumCustomer = true;
		boolean goldCustomer = true;
		

		int numberOfThreads = 0;

		Thread t1 = new Thread(new Runnable(){
			public void run(){
				Abc platinum = Abc.getInstance();
				platinum.getMilk = 4;
				platinum.buyMilk();
				platinum.getRice = 8;
				platinum.buyRice();
					
			}
		});

		Thread t2 = new Thread(new Runnable(){
			public void run(){
				Abc gold = Abc.getInstance();
				gold.getMilk = 2;
				gold.buyMilk();
				gold.getRice = 4;
				gold.buyRice();
			}
		});

		if( platinumCustomer == true){
			numberOfThreads = Thread.activeCount();
			System.out.println("A : "+numberOfThreads);
			t1.start();
						
		}
		if( goldCustomer == true){
			numberOfThreads = Thread.activeCount();
			System.out.println("B : "+numberOfThreads);
			t2.start();
				         
					
		}	
		
	}
}


class Abc{
	int milk = 40;
	int getMilk;
	int rice = 80;
	int getRice;

	static Abc obj = new Abc();
	

	public void buyMilk(){
		milk = milk-getMilk;
		System.out.println("Milk left : "+milk);
	


	}
	public void buyRice(){
		rice = rice-getRice;
		System.out.println("Rice left : "+rice);
		
	}

	
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