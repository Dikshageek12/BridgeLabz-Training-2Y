package String.String_practice_problem;

public class Substring {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter the main string: ");
		String mainStr = sc.nextLine();
		System.out.print("Enter the substring to search: ");
		String subStr = sc.nextLine();
		int count = 0;
		int idx = 0;
		while ((idx = mainStr.indexOf(subStr, idx)) != -1) {
			count++;
			idx += subStr.length();
		}
		System.out.println("Occurrences of substring: " + count);
		sc.close();
	}
}
