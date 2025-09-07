package String.String_practice_problem;

public class LongestWord {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split("\\s+");
		String longest = "";
		for (String word : words) {
			if (word.length() > longest.length()) {
				longest = word;
			}
		}
		System.out.println("Longest word: " + longest);
		sc.close();
	}
}
