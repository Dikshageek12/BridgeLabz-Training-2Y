package String.String_practice_problem;

public class ReplaceWord {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String sentence = sc.nextLine();
		System.out.print("Enter the word to replace: ");
		String oldWord = sc.nextLine();
		System.out.print("Enter the new word: ");
		String newWord = sc.nextLine();
		String[] words = sentence.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(oldWord)) {
				words[i] = newWord;
			}
		}
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < words.length; i++) {
			result.append(words[i]);
			if (i < words.length - 1) {
				result.append(" ");
			}
		}
		System.out.println("Modified sentence: " + result.toString());
		sc.close();
	}
}
