
import java.util.*;

public class Cikolata 
{
	public static int[] cikolataKirik(int cikolataSayisi)
	{
		int cikolataKaresi = 0, kirisSayisi = 1;

		for(int i = 0 ; i < 20 ; i++)
		{
			if(Math.pow(2, i) >= cikolataSayisi)
			{
				cikolataKaresi = (int) Math.pow(2, i);
				if(cikolataKaresi == cikolataSayisi)
					return new int[] {cikolataKaresi , 0};
				break;
			}
		}

		int kalan = cikolataKaresi - cikolataSayisi;
	
		kirisSayisi += cikolataKaresiKalan(cikolataKaresi/2 , kalan);

		return new int[] {cikolataKaresi,kirisSayisi};
	}
	
	public static int cikolataKaresiKalan(int cikolataKaresi , int kalan)
	{
		int count = 0;
		
		if(kalan %2 != 0) // Tek sayýlar için
		{
			count = (int) (Math.log(cikolataKaresi * 2) / Math.log(2));
			count--;
		}
		else // Çift sayýlar için
		{
			if((cikolataKaresi - kalan) > kalan)
				kalan = cikolataKaresi - (cikolataKaresi - kalan);
			else
				kalan = (cikolataKaresi - kalan);
			
			while(cikolataKaresi !=kalan)
			{
				cikolataKaresi /= 2;
			
				while(cikolataKaresi<kalan && cikolataKaresi >= 2 )
				{
					cikolataKaresi/= 2;
					count++;
				}
				
				if(cikolataKaresi < kalan && cikolataKaresi < 2) 
					break;

				count++;
			}
		}

		return count;
	}
	

	public static void main(String[] args) 
	{
		for(int i=1;i<1000;i++)
		{
			int[] answer = cikolataKirik(i);
			System.out.println(i + " cikolata sayisi için = "+ answer[0] + " cikolata karesine ve " + answer[1] +" kiris sayisina ihtiyaci vardir.");
		}
	}
}
