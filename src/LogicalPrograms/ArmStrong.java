package LogicalPrograms;

public class ArmStrong {

	public void getArm(int n) {

		int no = n;
		int armNum = 0;
		int t;

		while (n != 0) {

			t = n % 10;
			armNum = armNum + (t * t * t);
			n = n / 10;

		}
		if (no == armNum) {
			System.out.println(no + " Is Armstrong");
		} else {
			System.out.println(no + " Is Not Armstrong");
		}

	}

	public static void main(String[] args) {

		ArmStrong a = new ArmStrong();
		a.getArm(152);
	}

}
