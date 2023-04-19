import java.util.Arrays;

public class ArrayEqual {
    public static void main(String[] args) {
         /* 
        int []arr1={1,2,3,4,5};
        int []arr2={1,2,3,4,5};

        boolean res=Arrays.equals(arr1, arr2);
        if(res==true)
        {
            System.out.println("Yeah! the size is same");
        }
        else{

            System.out.println("its not");
        }
       */

    //    int arr[]={1,2,4,5};


    //    int sum1=0;
    //    for (int i = 0; i < arr.length; i++) 
    //    {
    //         sum1+=arr[i];
    //    }
    //    System.out.println(sum1);
    // String s1="pradeep";
    // String s2=s1.replaceAll("[aeoiou]", "-");
    // System.out.println(s2);
     String s1="java is an opp lan";
     String []arr=s1.split(" ");
     String resverse="";

     for (String string : arr) 
     {
        StringBuilder builder=new StringBuilder(string);
        builder.reverse();
        resverse+=builder.toString()+" ";
       
     }
     System.out.println(resverse);
       
    }
}
