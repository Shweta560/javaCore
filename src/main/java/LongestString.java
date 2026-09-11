public class LongestString {

    public static void main(String[] args) {

        String[] cities = {"Pune", "Mumbai", "Delhi", "Banglore"};

        String longestCity = cities[0];

        for (int i=0;i< cities.length; i++){
            System.out.println("Print all cities given:" + cities[i]);

            if(cities[i].length() > longestCity.length()){
                longestCity = cities[i];
            }

            }
        System.out.println("Largest name of the city:" + longestCity);

        }

}
