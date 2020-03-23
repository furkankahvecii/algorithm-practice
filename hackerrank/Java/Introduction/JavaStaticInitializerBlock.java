/*
 * https://www.hackerrank.com/challenges/java-static-initializer-block/problem
*/


public class JavaStaticInitializerBlock 
{
    static boolean flag;
	static Scanner scan=new Scanner(System.in);
	static int B=scan.nextInt();
	static int H=scan.nextInt();
	static 
    {
        if(B<=0 || H <=0)
        {
            flag=false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else
        {
            flag=true;
        }
    }

    public static void main(String[] args) 
    {
        if(flag)
        {
			int area=B*H;
			System.out.print(area);
		}
    }
}