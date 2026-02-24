public class OddEvenArray {
    //program to print odd and even numbers from an array
    public static void main(String args[]){
        int s,i;

        int[] a={33,4,2,65,33,1,9};

        for(i=0;i<a.length;i++){

            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    s=a[i];
                    a[i]=a[j];
                    a[j]=s;
                }
            }
        }
        System.out.print("Input numbers:");

        // for(int)
    }
}
