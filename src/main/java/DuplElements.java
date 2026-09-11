public class DuplElements {

    public static void main(String[] args) {

        int[] arr = {23, 44, 55, 98, 12, 23, 56, 98};

        for( int i=0; i<arr.length; i++){

            for(int j=i+1; j< arr.length; j++){

                if(arr[i] == arr[j]){
                    System.out.println("Duplicate : " + arr[i] );
                }
            }
        }
    }
}
