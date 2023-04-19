import java.util.*;

class RemoveDuplicateEle
{
    public static void main(String[] args) {
        String intput="hhello";
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < intput.length(); i++) 
        {
            char ch=intput.charAt(i);    
            int idx=intput.indexOf(ch,i+1);
            if(idx==-1)
            {
                sb.append(ch);
            }
        }
        System.out.println(sb);
        System.out.println(removeRepeatedSequence("mmssi"));

    }
    public static char removeRepeatedSequence(String input) {
        Set<Character> seen = new HashSet<>();
        for (int i = input.length() - 1; i >= 0; i--) {
            char c = input.charAt(i);
            if (seen.contains(c)) {
                // this character has already been seen, so continue to the next one
                continue;
            } else {
                // this is the first occurrence of this character, so return it
                return c;
            }
        }
        // if we get here, there were no unique characters in the input
        return '\0';
    }
    
}