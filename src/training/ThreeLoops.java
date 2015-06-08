package training;

public class ThreeLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ThreeLoops.twoLoops();
		ThreeLoops.threeLoops();
		
	}

	public static void threeLoops(){
		for (int i=1; i<=7; i++){
			for (int j=1; j<=i; j++){
				//print the numbers 123
				System.out.print(j);
			}
			for (int k=i+1; k<=7; k++){
				//print the star ****
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void twoLoops(){
		for (int i=1; i<=7; i++){
			for (int j=1; j<=7; j++){
				//print the numbers 123
				if(j<=i) {
					System.out.print(j);
				}
				else{
					System.out.print("*");
				}
			}
			System.out.println();
			
		}
	}
}
