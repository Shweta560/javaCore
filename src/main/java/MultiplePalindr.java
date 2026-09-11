public class MultiplePalindr {

    public static void main(String[] args) {

        String[] words = {"madam", "level", "tea", "racecar", "gits", "nation"};

        int count = 0;

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reverse = "";

            for (int j = word.length() - 1; j >= 0; j--) {

                reverse = reverse + word.charAt(j);

            }

            if (word.equals(reverse)) {
                System.out.println(word);
                count++;
            }

        }

        System.out.println("total palindrome: " + count);
    }
}
