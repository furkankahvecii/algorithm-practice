/*
* https://leetcode.com/problems/reformat-date/
*/



class Solution {
    public String reformatDate(String date) 
    {
        List<String> mm = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");	  
        String[] array = date.replaceFirst("[a-zA-Z]{2}", "").split(" ");

        return array[2]+"-"+String.format("%02d", mm.indexOf(array[1]) + 1 )+ "-"+	String.format("%02d", Integer.valueOf(array[0]));   
    }
    
}
