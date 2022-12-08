
public class DuplicateNumber {
	
	public static void main(String[] args) {

	//duplicate elements
		
		
		int a[]= {1,2,3,5,5,4,6};
		
		
		for(int i=0; i<a.length; i++) {
			for(int j=1+i;j<a.length;j++) {
				if(a[i] == a[j]) {
					System.out.println(a[i]);
				}
				
			}
					
		}
		
	
		
	
	}
	
	
	
}
