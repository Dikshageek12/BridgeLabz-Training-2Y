package String.String_practice_problem;

public class Palindrome {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		input = input.toLowerCase();
		boolean isPalindrome = true;
		int n = input.length();
		for (int i = 0; i < n / 2; i++) {
			if (input.charAt(i) != input.charAt(n - 1 - i)) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The string is a palindrome.");
		} else {
			System.out.println("The string is not a palindrome.");
		}
		sc.close();
	}
}
