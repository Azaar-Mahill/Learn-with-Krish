public class InsertionSort{

	public static void main(String[] args){
		int[] a={9,5,8,2};
		int[] arr=null;
		int x = 0;
		int y = 0;
			
		for(int i=1; i<a.length;i++){
			for(int j=i;j>0;j--){
				if(a[j-1] > a[j]) {
					x=a[j];
					y=a[j-1];
					arr = swap(x, y);
					a[j]=arr[0];
					a[j-1]=arr[1];
				}else{
					break;
				}

			}	
		}

		for(int z=0;z<a.length;z++){
			System.out.println(a[z]);
		}
	}

	public static int[] swap(int x, int y){
		int temp;
		int[] b = {0,0};

		temp =x;
		x=y;
		y=temp;
		
		b[0] = x;
		b[1] = y;
		
		return b;

	}
}