import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LongestSubstr
{
    public static void main(String[] args) 
    {
        String str="abcdab";    
      longest(str);
        
    }
    public static String longest(String str) 
    {
      HashSet <String> set= new HashSet<String>();
      String longestOverAll="";
      String longestTillNow="";
      for (int i = 0; i < str.length(); i++) 
      {
        char  c=str.charAt(i);  
        if(set.contains(c))
          {
            longestTillNow="";
            set.clear();
            
          }
          // set.add(c);
          longestTillNow+=c;

      
      if(longestTillNow.length()>longestOverAll.length())
      {
        longestOverAll=longestTillNow;
      }
    }
    System.out.println(longestOverAll);
     
      
    }
    
   
    
   
}