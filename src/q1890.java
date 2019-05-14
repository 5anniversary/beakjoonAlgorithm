import java.util.Random;
import java.util.Scanner;

public class q1890 {

    static int[][] makeSquaer(int length){
        int [][] squaer = new int[length][length];
        Random random = new Random();
        for(int i=0; i<length; i++)
            for (int j=0 ; j<length; j++)
                squaer[i][j] = random.nextInt(8)+1;

            squaer[length-1][length-1]=0;

        return squaer;
    }

    static void go(int squaer[][]){

    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        go(makeSquaer(length));

    }
}
