public class Anagram {
    
    boolean isAnagram(String str1,String str2){
           
        //if lengths are different -> not anagram
        if(str1.length() != str2.length())
            return false;
        
        //frequency array for 26 lowercase letters
        int[] count =new int[26];

        //increase count for str1 and decrease for str2
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i) -'a']++;//add char from str1
            count[str2.charAt(i)-'a']--;//remove char from str2
        }

        //if any value not zero -> mismatch
        for(int c : count){
            if(c!=0)
                return false;
        }
        return true;
    }
}
