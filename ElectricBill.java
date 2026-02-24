public class ElectricBill {
    //calculate electricity bill
    public static void main(String [] args){
        int units=223;
        int bill=0;

        if(units>100){
            if(units>=200){
                if(units>300){
                    bill=units*8;
                }
                else
                    bill=units*6;
            }
            else
                bill=units*5;
        }
        System.out.println("Maharashtra Electricity ltd");
        System.out.println("Units consumed :"+units);
        System.out.println("Tota Bill : "+bill);
    }
}
