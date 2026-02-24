public class ArmstrongNumbers {
    //Print armstrong number between 1 to 1000

    public static void main(String args[]){

        int num,rem,limit=100,sum=0;
        System.out.println("Armstrong numbers from 1 to N : ");

        for(int i=1;i<=limit;i++){
            num=i;
            while(num>0){
                 rem=num%10;
                 sum=sum+(rem*rem*rem);
                 num=num/10;
            }
            if(sum==i){
                System.out.println(i+"");
            }
            sum=0;
        }
    }
}
