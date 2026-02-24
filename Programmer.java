public class Programmer{
    
    public static void main(String [] args ){
        Programmer obj=new Programmer();
        obj.test();
    }

    void test(){
        System.out.println(isAnagram("Listen","silent"));
        System.out.println(AlternateCaps("hello"));
        System.out.println(LastWordLength("Hello Komal"));
    }

    //1.check Anagram
    boolean isAnagram(String str1,String str2){

        //if lengths differ-> cannot be anagram 
        if(str1.length() != str2.length())
		return false;
   
        //Track which characters in str2 are already used 
        boolean[] used=new boolean[str2.length()];
     
        //pich each character from str1
        for(int i=0;i<str1.length();i++){
        
 	Boolean match=false;//to check if match found in str2

        //searcj same character in str2
        for(int j=0;j<str2.length();j++){
 	
	//if characters match and not already used
	if(str1.charAt(i) ==str2.charAt(j) && !used[j]){
        	 used[j] = true;//mark character as used
		match =true;
		break;

	    }
        }
	//if any character not matched -> nnot anagram
             if(!match)
		return false;

        }
        
       return true; //all charcters matched
    }

    //Capitalize alternate characters
    String AlternateCaps(String str){
        String result=" ";

        //Treaverse each character 
        for(int i =0;i<str.length();i++){

            //even index->uppercase
            if(i%2==0)
                result += Character.toUpperCase(str.charAt(i));
            else 
                //odd index->lowercase
                result += Character.toLowerCase(str.charAt(i));
        }
        return result;
    }

    int LastWordLength(String str){
        
        //remove spaces from start and end
        str=str.trim();

        //split  string into words
        String[] words =str.split("");

        //return last word length
        return words [words.length -1].length();
    }

    //find first non repeating charcter
    char FirstNonRepeat(String str){

        //check each charcter
        for(int i=0;i<str.length();i++){
            int count=0;

            //count occurances of current character
            for(int j=0;j<str.length();j++){

                if(str.charAt(i) == str.charAt(j))
                    count++;
            }

            //if character appears once -> return it
            if(count ==1)
                return str.charAt(i);
        }
        //if no unique character found
        return '#';
    }

}