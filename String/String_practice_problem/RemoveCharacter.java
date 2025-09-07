package String.String_practice_problem;

public class RemoveCharacter {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		System.out.print("Enter the character to remove: ");
		char toRemove = sc.next().charAt(0);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) != toRemove) {
				result.append(input.charAt(i));
			}
		}
		System.out.println("Modified String: \"" + result.toString() + "\"");
		sc.close();
	}
}
