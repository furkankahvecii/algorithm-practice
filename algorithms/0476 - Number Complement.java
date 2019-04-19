/*
* https://leetcode.com/problems/number-complement/
*/



class Solution 
{
    public int findComplement(int num) 
    {
		 StringBuilder binary=new StringBuilder(Integer.toString(num,2));
		 for(int i=0;i<binary.length();i++)
		 {
			 if(binary.charAt(i)=='1') binary.setCharAt(i, '0');
			 else
				 binary.setCharAt(i, '1');
		 } 
		return binartytoInt(binary.toString());
    }
    
     static int binartytoInt(String binary)
	 {
		 int result=0;
		 for(int i=binary.length()-1;i>=0;i--)
		 {
			 if(binary.charAt(i)=='1') result+=Math.pow(2, binary.length()-i-1);
		 }
		 return result;
	 }
}