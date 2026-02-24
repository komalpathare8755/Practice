public class LastWordLength {
    
    static int Solution(String s){

        int i=s.length()-1;
        int length=0;

        //skip spacces from the end
        while (i>=0 && s.charAt(i)==' ') {
            i--;
        }

        //count charcters until space found
        while(i>=0 && s.charAt(i) != ' '){
             length++;
             i--;
        }
        return length;
    }
}
