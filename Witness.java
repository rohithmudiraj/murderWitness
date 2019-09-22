package murder;

public class Witness {
	
	public static void check(int[] a) {
		int max=a[a.length-1],i = a.length-1;
		
		System.out.println(a[i]);
		
		while(i>0) {
			
		
					
		if(max<a[i-1]) {
	
			System.out.println(a[i-1]);
			max=a[i-1];
			//System.out.println(max);
			i--;
			
		}
		else {
			System.out.println("cant see");
			i--;
		}
		}
		
	}
	
	public static void main(String[] args) {
		int[] a = new int[] {8,1,3,4,2};
		Witness.check(a);
	}

}
;