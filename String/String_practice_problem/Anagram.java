package String.String_practice_problem;

public class Anagram {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter first string: ");
		String str1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
		System.out.print("Enter second string: ");
		String str2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
		if (str1.length() != str2.length()) {
			System.out.println("The strings are not anagrams.");
			sc.close();
			return;
		}
		int[] freq = new int[256]; // ASCII size
		for (int i = 0; i < str1.length(); i++) {
			freq[str1.charAt(i)]++;
			freq[str2.charAt(i)]--;
		}
		boolean isAnagram = true;
		for (int i = 0; i < 256; i++) {
			if (freq[i] != 0) {
				isAnagram = false;
				break;
			}
		}
		if (isAnagram) {
			System.out.println("The strings are anagrams.");
		} else {
			System.out.println("The strings are not anagrams.");
		}
		sc.close();
	}
}
