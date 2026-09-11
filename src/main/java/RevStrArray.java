public class RevStrArray {

//    Print all elements of a String array and revserse it

    public static void main(String[] args) {

        String[] employee = {"Rakesh", "Dinesh", "Sanket", "kiya"};

        for(int i=0; i< employee.length; i++){
            System.out.println(employee[i]);
        }

        System.out.println("Print in reverse order:");

        for (int i= employee.length-1; i>=0; i-- ){
            System.out.println(employee[i]);
        }
    }
}
