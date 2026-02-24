public class CheckSortedArray {

    public static void main(String[] args) {

        int arr[] = {22,2, 3, 4, 6, 7};

        boolean sorted = true;

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted)
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }
}