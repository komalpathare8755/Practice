public class ClosestPrime {
    static boolean isPrime(int n){
        if(n<=1) return false; 

         for(int i= 2;i*i <= n;i++){
            if(n % i==0) return false;
         }
         return true;
    }

    public static void main(String [] args)
{
    int n=1;

    // if(isPrime(n)){
    //     System.out.print(n);
    //     return;
    // }

    int i=1;
    while (true) {
        if(isPrime(n-i)){
            System.out.println(n-i);
        break;
    
        }
        if(isPrime(n+i)){
            System.out.println(n+i);
            break;
        }
        i++;
    }

}}
