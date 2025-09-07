package String.String_practice_problem;

public class RemoveDuplicates {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (result.indexOf(ch) == -1) {
				result += ch;
			}
		}
		System.out.println("String after removing duplicates: " + result);
		sc.close();
	}
}
