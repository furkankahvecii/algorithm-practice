import java.io.IOException;
import java.util.*;
import javax.swing.*;
import java.awt.*;


 class Pos {

	public int x;
	public int y;
	public int depth;
	
	Pos(int x, int y, int depth) {
		this.x = x;
		this.y = y;
		this.depth = depth;
	}

	public boolean equals(Pos that) {
		return this.x == that.x && this.y == that.y;
	}

	public String toString() {
		return "("+this.x + " " + this.y+ " " + this.depth +")";
	}
}
 


public class chessKnight extends JFrame{
	
	public chessKnight(String title,ArrayList dizi) 
	{
		Color blackColor = Color.BLACK;
		Color whiteColor = Color.WHITE;
		Color yellowColor = Color.GREEN;
		JButton chessButton = null;
		for (int i = 0; i <8; i++) {
			for(int j=0;j<8;j++)
			{
				chessButton = new JButton();
				if(dizi.contains(i+""+j))
				{
					if(dizi.get(0).equals(i+""+j)||dizi.get(dizi.size()-1).equals(i+""+j))
					{
						chessButton.setIcon( new ImageIcon("C:\\Users\\Heyamigo\\Desktop\\indir.png")); // horse image path
					}
					else
					{
						chessButton.setBackground(yellowColor);
						chessButton.setText(String.valueOf(dizi.size()-1-dizi.indexOf(i+""+j)));	
					}
				}
				
				else
				{
					if (j % 2 == 0)  
						chessButton.setBackground(blackColor);
					else 
						chessButton.setBackground(whiteColor);
				}
				
				if (j==7) 
				{ 			
					Color temp = blackColor;
					blackColor = whiteColor;
					whiteColor = temp;
				}			
				add(chessButton);	
			}
		}
		this.setTitle(title); 
		this.setLayout(new GridLayout(8, 18)); 
		this.setSize(650, 650); 
		this.setVisible(true);
	}

	public chessKnight(ArrayList visitedNode,ArrayList dizi)
	{
		JButton chessButton = null;
		Color blackColor = Color.BLACK;
		Color whiteColor = Color.WHITE;
		Color greenColor=Color.GREEN;
		for (int i = 0; i <8; i++) {
			for(int j=0;j<8;j++)
			{
				chessButton = new JButton();
				if(dizi.get(0).equals(i+""+j))
				{
					chessButton.setIcon( new ImageIcon("C:\\Users\\Heyamigo\\Desktop\\indir.png")); // horse image path
				}
				else
				{
					if(visitedNode.contains(i+""+j))
					{
						int adim=(int) visitedNode.get(visitedNode.indexOf(i+""+j)+1);
						adim--;
						if(adim==0 )
						{
							chessButton.setIcon( new ImageIcon("C:\\Users\\Heyamigo\\Desktop\\indir.png")); // horse image path
						}
						else
						{
							chessButton.setBackground(greenColor);
							chessButton.setText(String.valueOf(adim));
						}
					}
					else
					{
						if (j % 2 == 0)  chessButton.setBackground(blackColor);
						else chessButton.setBackground(whiteColor);
					}
				}
				if (j==7) 
				{ 			
					Color temp = blackColor;
					blackColor = whiteColor;
					whiteColor = temp;
				}				
				add(chessButton);
			}
		}

		this.setTitle("My sample space"); 
		this.setLayout(new GridLayout(8, 18)); 
		this.setSize(650, 650); 
		this.setVisible(true);
	}

	static final Pos[][] chessboard = new Pos[8][8];
	static Queue<Pos> q = new LinkedList<Pos>();
	static ArrayList visitedNode =new ArrayList();
	static int sayac=0;

	public static void main(String[] args) throws IOException 
	{
		populateChessBoard();
		Pos start = new Pos(0, 0, 0);
		Pos end = new Pos(7, 7, Integer.MAX_VALUE);
		int[][] set=new int[10][2];
		ArrayList liste=new ArrayList();
		chessboard[0][1] = new Pos(start.x, start.y, 0);
		q.add(start);

		while (q.size() != 0) 
		{
			Pos pos = q.poll(); 
			if (end.equals(pos)) {
				sayac++;
				Iterable<Pos> path = getShortestPath(start, end);
				System.out.println("Gerekli minimum adim sayisi: " + pos.depth );
				System.out.println("Gidilen Dugumler");
				liste.add(pos.x+""+pos.y);
				for(Pos position: path) {
					liste.add((position.x+""+position.y));
					
				}

				for(int i=liste.size()-1;i>=0;i--) System.out.println("("+liste.get(i).toString().charAt(0)+" "+liste.get(i).toString().charAt(1)+")");
				 
				System.out.println(sayac + " adim atilmistir.");
				
				String title = "My Chess Board";
				chessKnight chessBoard = new chessKnight(title,liste); 
				chessKnight chessBoard2 = new chessKnight(visitedNode,liste); 

				return;
			}
			else {
				bfs(pos, ++pos.depth);
			}
		}

		System.out.println("At icin hedef konuma ulasilamadi.");
		
	}
	private static void bfs(Pos current, int depth) 
	{
		sayac++;
		for (int i = -2; i <= 2; i++) { 
			for (int j = -2; j <= 2; j++) {
			
				Pos next = new Pos(current.x + i, current.y + j, depth);
				if(inRange(next.x, next.y)) {
					if(current.equals(next)) continue;
					
					if (isValid(current, next)) {
						Pos position = chessboard[next.x][next.y] ;
						if (position.depth > depth) {
							chessboard[current.x + i][current.y + j] = new Pos(current.x, current.y, depth);
							q.add(next);
							if(!visitedNode.contains(current.x+""+current.y))
							{
								visitedNode.add(current.x+""+current.y);
								visitedNode.add(current.depth);
							}
						}
					}
				}
			}
		}
	}

	private static boolean inRange(int x, int y) 
	{
		sayac++;
		return 0 <= x && x < 8 && 0 <= y && y < 8;
	}

	public static boolean isValid(Pos current, Pos next) 
	{
		int deltaR = next.x - current.x;
		int deltaC = next.y - current.y;
		sayac++;
		return 5 == deltaR * deltaR + deltaC * deltaC;
	}

	private static void populateChessBoard() 
	{
		for (int i = 0; i < chessboard.length; i++) {
			for (int j = 0; j < chessboard[0].length; j++) {
				chessboard[i][j] = new Pos(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
				sayac++;
			}
		}
	}
	
	private static Iterable getShortestPath(Pos start, Pos end) 
	{
		Stack<Pos> path = new Stack<Pos>();
		Pos current = chessboard[end.x][end.y];
		while(! current.equals(start)) 
		{
			path.add(current);
			current = chessboard[current.x][current.y];
			sayac++;
			
		}
		
		path.add(new Pos(start.x, start.y, 0));
		return path;
	}
}