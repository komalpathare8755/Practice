public class PallindromeNumberCheck {
    //program to check the given number is pallindrome or not

    public static void main(String[] args){
        int n=121,pal,r,rev=0;
        pal=n;

        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;

        }

        if(rev==pal){
            System.out.println("The given  is pallindrome"+rev);
        }else{
            System.out.println("The given no is not pallindrome"+rev);
        }
    }
}
