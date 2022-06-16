public class Factorial{

	public static void main(String[] args){
		int n=2;
		
		System.out.println(factorial(n));
	};

	public static int factorial(int n){
		int fact=1;

		for(int i=n;i>0;i--){
			fact=fact*i;
		}
		return fact;
	}
}