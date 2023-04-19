import java.util.*;
class TotallengthOfEachWord
{
    public static void main(String[] args) {
        String str="iam in bangalore ";
        str.trim();
        String[] s2=str.split(" ");
        String s3="";
        for (int i = 0; i <s2.length; i++) 
        {
           s3+=s2[i].length()+s2[i]+" ";
        }
        System.out.println(s3);
        

    }
}