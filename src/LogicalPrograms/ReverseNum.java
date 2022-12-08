package LogicalPrograms;

public class ReverseNum {

	public static void main(String[] args) {
		
		int no=12345;
		int rev=0;
		int rem;
		
		while(no != 0) {
			
			rem = no % 10; // 12345 / 10 = 5 , 1234 % 10 = 4, 
			rev = rev * 10+rem;// 5 , 54 ,
			no = no /10;// 1234, 1234/10 = 123, 
			
		}
		System.out.println(rev);
		
	}
	
}
