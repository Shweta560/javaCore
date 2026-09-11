public class SmallestWord {

//    Guess the smallest word

    public static void main(String[] args) {

        String[] country = {"India", "USA", "UK", "Ireland"};

        String smallest = country[0];

        for (int i=1 ; i< country.length; i++)
        {
            if (country[i].length() < smallest.length())
            {
                smallest = country[i];
            }

        }

        System.out.println("Smallest word here is:" + smallest);
    }
}
