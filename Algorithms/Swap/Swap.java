public class Swap{

	public static void main(String[] args){
		int x=2;
		int y=11;

		swap(x,y);
	};

	public static void swap(int x, int y){
		int temp;

		temp = x;
		x=y;
		y=temp;

		System.out.println("x is : "+x);
		System.out.println("y is : "+y);
	};
}