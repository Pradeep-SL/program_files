public class DemoSolution {
    public static void main(String[] args) 
    {
        String s = "I am in Bangalore";
			String temp = "";
			char[] s3 = s.toCharArray();
			int space = 0;
			int index = 0;
			
			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);
				if(c== ' ') space++;
			}
			String []a = new String[space+1];
			for(int j=0; j<s.length();j++) {
				char c1 = s.charAt(j);
				if(c1 != ' ') {
					temp=temp+c1;
				}
				else 
				{
					a[index++] = temp;
					temp = "";   // empty space again
				}
			}
			a[index] = temp;
			for(String n:a) System.out.print(n+" ");
			System.out.println(a.length);  // for checking purpose 
    }
}
