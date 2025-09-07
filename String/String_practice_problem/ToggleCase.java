package String.String_practice_problem;

public class ToggleCase {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		StringBuilder toggled = new StringBuilder();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				toggled.append(Character.toLowerCase(ch));
			} else if (Character.isLowerCase(ch)) {
				toggled.append(Character.toUpperCase(ch));
			} else {
				toggled.append(ch);
			}
		}
		System.out.println("Toggled case string: " + toggled);
		sc.close();
	}
}
