public class AllSum {

    public static void main(String[] args) {

        int[] arr = {2,6,7,43};

        int sum = 0;

        for (int i=0; i< arr.length; i++){
            sum = sum + arr[i];
        }

        System.out.println("Sum of all numbers:" + sum);
    }
}
