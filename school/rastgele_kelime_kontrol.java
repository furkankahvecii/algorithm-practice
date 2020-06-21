import java.util.Random;

public class Algorithm {

	public static String rastgeleOlustur(String A[], int uzunluk)
    {
      	StringBuilder rastgeleKelime = new StringBuilder("");
		while(uzunluk-->0) {
			rastgeleKelime.append(A[new Random().nextInt(A.length)]);
		}
		return rastgeleKelime.toString();
    }
	
	public static int kelimeKontrol(String word)
    {
		if(word.length() == 0 || word == null)
			return 0;
		
		if(word.startsWith("b") && (word.endsWith("b") || word.endsWith("c"))) {
			for(int i=0;i<word.length()-1;i++)
			{
				if(word.charAt(i) == 'a' && word.charAt(i) == word.charAt(i+1))
				return 0;		
			}
			return 1;
		}
		
		return 0;
    }
	
	public static void main(String[] args) throws IOException 
	{
		String[] kume = {"a","b","c"};
		int kelimeUzunluk = 20;
		
		String word = rastgeleOlustur(kume,kelimeUzunluk);
		int sonuc = kelimeKontrol(word);
		
		System.out.println(word + " kelimesinin sonucu = " + sonuc);
	}
}