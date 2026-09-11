public class ArraySum {

//    Find the sum of 12

    public static void main(String[] args) {

        int arr[] = { 10,6,45,2};

        int target = 12;

        for (int i=0; i<arr.length; i++){

            for (int j=i+1; j<arr.length; j++) {

                if(arr[i]+arr[j] == target) {

                    System.out.println(arr[i]+ "+" + arr[j] + "=" + target );
                }
            }
        }


    }
}
