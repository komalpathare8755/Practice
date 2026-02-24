public class LargestInArr {
    public static void main(String[] args){
        int arr[]={3,4,52,4};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println(max);
    }
}
