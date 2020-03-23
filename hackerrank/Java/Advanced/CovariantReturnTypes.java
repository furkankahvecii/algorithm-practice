/*
 * https://www.hackerrank.com/challenges/java-covariance
*/


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Flower 
{
    String whatsYourName()
    {
    	return new String("I have many names and types.");
    }
}
	
class Jasmine extends Flower{
	@Override
	String whatsYourName() {
		// TODO Auto-generated method stub
		return "Jasmine";
	}
}

class Lily extends Flower{
	@Override
	String whatsYourName() {
		// TODO Auto-generated method stub
		return "Lily";
	}
}

class Region {
	Flower yourNationalFlower()
    {
    	return new Flower();
    }
}

class WestBengal extends Region{
	@Override
	Flower yourNationalFlower() {
		// TODO Auto-generated method stub
		return new Jasmine();
	}
}

class AndhraPradesh extends Region{
	Lily yourNationalFlower() {
		// TODO Auto-generated method stub
		return new Lily();
	}
}


public class CovariantReturnTypes 
{
  public static void main(String[] args) throws IOException 
  {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String s = reader.readLine().trim();
      Region region = null;
      switch (s) {
        case "WestBengal":
          region = new WestBengal();
          break;
        case "AndhraPradesh":
          region = new AndhraPradesh();
          break;
      }
      Flower flower = region.yourNationalFlower();
      System.out.println(flower.whatsYourName());
    }
}