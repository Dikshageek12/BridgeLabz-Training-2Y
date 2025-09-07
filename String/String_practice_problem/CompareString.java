package String.String_practice_problem;

public class CompareString {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine();
		int minLen = Math.min(str1.length(), str2.length());
		int cmp = 0;
		for (int i = 0; i < minLen; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				cmp = str1.charAt(i) - str2.charAt(i);
				break;
			}
		}
		if (cmp == 0) {
			if (str1.length() == str2.length()) {
				System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are equal in lexicographical order");
			} else if (str1.length() < str2.length()) {
				System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
			} else {
				System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
			}
		} else if (cmp < 0) {
			System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
		} else {
			System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
		}
		sc.close();
	}
}
