public class SumOfDigit {
    public static void main(String [] args){
        int n=12;
        int sum=0;

        while (n>=10) {
            sum+= n%10;
            n=n/10;
            
        }
        System.out.print(sum);
    }
}
