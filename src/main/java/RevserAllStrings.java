public class RevserAllStrings {

    public static void main(String[] args) {

        String[] lang = {"Marathi", "Hindi", "English", "French"};

        for (int j = 0; j < lang.length; j++) {
            String reversed = "";

            for (int i = lang[j].length() - 1; i >= 0; i--) {
                reversed = reversed + lang[j].charAt(i);
            }

            System.out.println(reversed);
        }
    }
}
