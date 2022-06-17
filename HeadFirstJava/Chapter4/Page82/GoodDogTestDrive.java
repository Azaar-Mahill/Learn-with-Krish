class GoodDogTestDrive{

	public static void main(String[] args){
	
	GoodDog one = new GoodDog();
/*
		for(int i=0; i<100;i=i+10){
			one.setSize(i);
			System.out.println("Size :" + one.getSize());
			one.Bark();
*/
		one.access=1234;
		for(int i=0; i<100;i=i+10){
			one.setSize(i);
			System.out.println("Size :" + one.getSize());
			one.Bark();
		}
		one.access=4321;
		for(int i=100; i<200;i=i+10){
			one.setSize(i);
			System.out.println("Size :" + one.getSize());
			one.Bark();
		}

	}
}

class GoodDog{

	private int size;
	int access;

	public int getSize(){
		if(access==4321){
			return size;
		}
		return -1;
	}
/*
	public void setSize(int s){
		size=s;
	}
*/
	public void setSize(int s){
		
		if(s<140){
			size=s;
		}else{
			size=size;
		}

	}
	void Bark(){
		if(size > 60){
			System.out.println("Woof! Woof!");
		}else if(size>14){
			System.out.println("Ruff! Ruff!");			
		}else{
			System.out.println("Yip! Yip!");
		}
	}
}