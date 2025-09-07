package String.String_practice_problem;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] freq = new int[256]; // ASCII size
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;
        }
        int maxFreq = 0;
        char mostFreqChar = ' ';
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFreqChar = ch;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFreqChar + "'");
        sc.close();
    }
}
