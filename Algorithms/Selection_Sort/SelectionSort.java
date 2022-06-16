public class SelectionSort{

	public static void main(String[] args){
		int[] a={9,5,8,2};
		int least = 0;
		int[] arr=null;
		int x = 0;
		int y = 0;
			
		for(int i=0; i<(a.length-1);i++){
			least = i;
			for(int j=i+1;j<a.length;j++){
				if(a[least] > a[j]) {
					least = j;
				
				}

			}
			x=a[i];
			y=a[least];
			arr = swap(x, y);
			a[i]=arr[0];
			a[least]=arr[1];	
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