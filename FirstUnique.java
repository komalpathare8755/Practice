public class FirstUnique {
    
    static char Solution(String s){

        //frequency array for asscii charcters
        int[] count = new int[256];

        //count occurance of each charcter
        for(char c : s.toCharArray())
            count[c]++;

        //return first charcter with frequency =1
        for(char c : s.toCharArray())
            if (count[c]==1) {
                return c;
            }

        return '_';//if no character
    }
}
