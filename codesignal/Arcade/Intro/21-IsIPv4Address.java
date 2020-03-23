/*
 * https://app.codesignal.com/arcade/intro/level-5/veW5xJednTy4qcjso
*/

boolean isIPv4Address(String inputString) {
	String[] splitArray = inputString.split("[.]");
	if(splitArray.length!=4)
		return false;

	for(String a : splitArray)
	{
		try { if(a.equals("") || Integer.valueOf(a)<0 || Integer.valueOf(a)>255)
			return false;	
		}
		catch(Exception e) {
			return false;
		}

	}
	
	return true;    
}
