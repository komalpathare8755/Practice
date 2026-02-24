public class AlternateCaps {
 
    //alternate caps
    static String alternatecaps(String s){

        //stringbuilder is faster than string concatenation
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){

            //even index -> Uppercase
            if(i%2 == 0)
                sb.append(Character.toUpperCase(s.charAt(i)));

            //odd index->lowerscae
            else
                sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
}
