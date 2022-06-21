class Patient{

	public static void main(String[] args){

		int number=2;
		if(number==0){
			Doctor d = new Doctor();
			d.treatPatient();
		}
		if(number==1){
			FamilyDoctor FD = new FamilyDoctor();
			FD.treatPatient();
			FD.giveAdvice();
		}
		if(number==2){
			Surgeon S = new Surgeon();
			S.treatPatient();
			S.makeIncision();
		}
	}
}

class Doctor{

	boolean worksAtHospital;

	void treatPatient(){
		System.out.println("Checkup");
	}
}

class FamilyDoctor extends Doctor{
	
	boolean makesHouseCalls;

	void giveAdvice(){
		System.out.println("Give Advice");		
	}
}

class Surgeon extends Doctor{

	void treatPatient(){
		System.out.println("Surgery");
	}

	void makeIncision(){
		System.out.println("Incision");
	}
}