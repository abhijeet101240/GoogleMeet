package LogicalPrograms;

public class Fibonacci {

	public void getFib(int n) {
		int no = n;
		int a = 0;
		int b = 1;
		int c;
		System.out.print(a + " " + b);

		for (int i = 1; i <= no; i++) {

			c = a + b;
			System.out.print(" "+ c);

			a = b;
			b = c;

		}

		// 0 1 1 2 3 5 8
	}

	public static void main(String[] args) {

		Fibonacci f = new Fibonacci();
		f.getFib(10);
	}

}
