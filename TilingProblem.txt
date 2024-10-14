/* Tiling problem:

	Given a board of size "2*n" and tile of size "2*1", count the number
	of ways to tile the given board.

	Hints:

	For placing a tile,we have 2 placements like one is the 
	Horizontally and second is verticallly. 

*/



import java.util.Scanner;
import java.io.*;
public class TilingProblem{
	public static int getWay(int n){
		//Base Case
		if(n <= 3)
			return n;
		//Recursive call
		else
			return getWay(n-1) + getWay(n-2);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n for 2*n board size: ");
		int n = sc.nextInt();
		
		int result = getWay(n);
		System.out.print("\nFor n = "+n+", Total ways = "+result);
		sc.close();
	}
}