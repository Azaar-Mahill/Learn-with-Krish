public class Recursive{

	public static void main(String[] args){
		int n=5;
		int r;

		if(n>1){
			r=n*factorial(n-1);
		}else{
			r=1;
		}		
		System.out.println(r);
	};

	public static int factorial(int n){
		int fact=1;

		for(int i=n;i>0;i--){
			fact=fact*i;
		}
		return fact;
	}
}