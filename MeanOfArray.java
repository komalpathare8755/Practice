public class MeanOfArray {
    
    public static void main(String [] args){

        int arr[]={3,6,3};

        int sum=0,mean=0;

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }

        mean=sum/arr.length;

        System.out.println("Mean is "+mean);
    }
}
