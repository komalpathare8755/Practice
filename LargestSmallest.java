public class LargestSmallest {
    public static void  main(String[] args){
        int a[] =new int[] {23,34,13,64,72,90,10,15,9,27};

        int min=a[0];//let first smallest

        int max=a[0];//let first largest

        for(int i=1;i<a.length;i++){
            if(a[i]>max){
            max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("Largest number in a given array is : "+max);
        System.out.println("Smallest number in a given array is :"+min);
    }
}
