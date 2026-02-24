public class OddNumbers {
    public static void main(String args[]){
        System.out.println("The odd numbers are : ");
        int count=0;
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                // count++;
            }
        }
        System.out.println();
        System.out.println("THe count of total odd numbers are " +count

        );

    }
}
