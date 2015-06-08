package training;
import java.util.Scanner;
public class MultiArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int table[][] = new int [3][4];
		for(a=0; a<3; a++){
			for (b=0; b<4; b++){
				table[a][b] = (a*4)+b+1;
				System.out.print(table[a][b]+"");
				
			}
		System.out.println();
		}
		
	}
	Scanner sc = new Scanner(System.in);
	
	
}
