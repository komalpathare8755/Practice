public class ReverseArray {
    
    public static void main(String [] args){
    //     int arr[]={1,4,3,2,6,5};
    //     int k=0;
    //    int newarr[] = new int[arr.length];
    //     for(int i=arr.length-1;i>=0;i--,k++){
    //         newarr[k]=arr[i];

    //     }

    //     System.out.print("Reverse array is ");
    //     for(int i=0;i<newarr.length;i++){
    //         System.out.println(newarr[i]+" ");
    //     }
        //swaping 
        int arr[] = {1, 4, 3, 2, 6, 5};

int i = 0;
int j = arr.length - 1;

while(i < j){
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;

    i++;
    j--;
}    
}
}
