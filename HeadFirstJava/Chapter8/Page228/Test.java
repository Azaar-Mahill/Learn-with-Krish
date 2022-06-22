class Test{

	public static void main(String[] args){

		Report2 R2 = new Report2();
		R2.runReport();
	}
}

abstract class Report{

	void runReport(){
		System.out.println("Report1");
	}
}

class Report2 extends Report{

	void runReport(){
		super.runReport();
		System.out.println("Report2");
	}
}