public class ParticularLetter {

//    count string starting with particular letter

    public static void main(String[] args) {

        String[] letters = {"Danish", "Swish", "English", "Polish", "Ponyo", "Dorothy"};

        int count = 0;

        for (int i=0; i< letters.length; i++){
            if (letters[i].startsWith("D") || letters[i].startsWith("P")){
                count++;
            }

        }

        System.out.println(count);
    }
}
