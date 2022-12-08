
public class Test {

	public static void main(String[] args) {
		// palindrome
		/*
		 * int no = 353; int temp = no; int rev = 0, rem; while (temp != 0) { rem = temp
		 * % 10; rev = rev * 10 + rem; temp = temp / 10;
		 * 
		 * }if(no == rev) { System.out.println(no+" is Palindrome"); }else {
		 * System.out.println(no + " is not palindrome"); }
		 */
		// String As Palindrome

		String str = "madam";
		String temp = str;
		String rstr = "";
		char ch;

		for (int i = 0; i < str.length(); i++) {

			ch = temp.charAt(i);
			rstr = ch + rstr;
		}
		if (rstr.equals(str)) {
			System.out.println(str + " Is Palindrome String ");
		} else {
			System.out.println(str + " is not palindrome String");
		}

	}
}
