package LogicalPrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int no =10 ;
		int i = 2;
		while (i <= no / 2) {
			if (no % i == 0) {
				System.out.println(no + " Is Not Prime");
				return;
			}
			i++;
				
			}
			System.out.println("Number Is Prime");
		}

}
