class Test{

	public static void main(String[] args){
		int a =1;
		int b=2;
		OverLoads O = new OverLoads();
		System.out.println(O.addNums(a,b));
		double c=3.25;
		double d=4.50;
		System.out.println(O.addNums(c,d));

		O.setUniqueID("1234");
		System.out.println(O.uniqueID);
		O.setUniqueID(5678);
		System.out.println(O.uniqueID);
	}
}

class OverLoads{

	String uniqueID;

	public int addNums(int a, int b){
		return a + b;
	}

	public double addNums(double a, double b){
		return a + b;
	}

	public void setUniqueID(String theID){
		uniqueID = theID;
	}

	public void setUniqueID(int ssNumber){
		String numString = ""+ssNumber;
		setUniqueID(numString);
	}
}