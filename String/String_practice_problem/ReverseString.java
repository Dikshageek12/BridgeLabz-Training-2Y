package String.String_practice_problem;

public class ReverseString {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();
		String reversed = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += input.charAt(i);
		}
		System.out.println("Reversed string: " + reversed);
		sc.close();
	}
}
