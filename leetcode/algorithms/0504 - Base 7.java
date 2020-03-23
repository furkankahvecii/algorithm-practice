/*
* https://leetcode.com/problems/base-7/
*/



class Solution 
{
    public String convertToBase7(int num) 
    {
        int base = 7;
        StringBuilder str = new StringBuilder();
        boolean flag = false;
        if(num<0)
        {
            flag=true;
            num*=-1;
        }
        while(num>=base)
        {
            str.append(num%base);
            num/=base;
        }
        str.append(num);
        if(flag)
            return str.append("-").reverse().toString();
        else
            return str.reverse().toString();
    }
}