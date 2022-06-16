public class Fibanacci{

	public static void main(String[] args){
		int n=4;

		System.out.println(fibanacci(n));
	};

	public static int fibanacci(int n){
		if(n>2){
			return fibanacci(n-1) + fibanacci(n-2);
		}else{
			return 1;
		}
	};
}