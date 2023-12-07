package student_dmitrijs_voronins.lesson_3.Level_7;

import java.util.Random;
import java.util.Scanner;

public class Dice {
    private int value;
    public void setValue(int diceValue){
        value =diceValue;
    }
    public int getValue(){
        return value;
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(6)+ 1;
    }
    public void rolll(){
        Scanner scanner = new Scanner(System.in);


    }
}
