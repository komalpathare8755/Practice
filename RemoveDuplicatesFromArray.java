public class RemoveDuplicatesFromArray {

    public static void main(String[] args) {

        int arr[] = {2, 22,2, 2, 3, 4, 2, 2};

        System.out.print("After removing duplicates: ");

        for(int i = 0; i < arr.length; i++){

            boolean alreadyPrinted = false;

            // Check if arr[i] appeared before
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    alreadyPrinted = true;
                    break;
                }
            }

            // Print only if not seen before
            if(!alreadyPrinted){
                System.out.print(arr[i] + " ");
            }
        }
    }
}