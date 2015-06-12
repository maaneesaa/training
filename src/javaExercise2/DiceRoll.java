package javaExercise2;
import java.lang.Math;

public class DiceRoll {

	public static void main(String[] args) {
		DiceRoll instance = new DiceRoll();
		System.out.println(instance.diceRollTimes());
	}
	public int diceRollTimes(){
		int counter = 0;
		while(true){
			counter++;
			int value = (int)(6*Math.random() + 1);
			int value2 = (int)(6*Math.random() + 1);
			if(value == 1 && value2 == 1){
				break;
			}
		}
		
		return counter;
	}

}
