public class Demo {

	public static void main(String[] args) {

		/*
		 * int no = 151; int temp = no; int armNum = 0, rem;
		 * 
		 * while (temp != 0) { rem = temp % 10; armNum = armNum + (rem * rem * rem);
		 * temp = temp / 10;
		 * 
		 * }if(no == armNum) { System.out.println(no +" is Armstrong Number"); }else {
		 * System.out.println(no +"  Is Not ArmStrong Number"); }
		 */

		int no = 151;
		int temp = no;

		int armNum = 0;
		int rem;

		while (temp != 0) {

			rem = temp % 10;
			temp = temp / 10;
			armNum = armNum + (rem * rem * rem);

		}
		if (armNum == no) {
			System.out.println(no + " Is ArmStrong");

		} else {
			System.out.println(no + " Is Not ArmStrong");
		}
	}
}
