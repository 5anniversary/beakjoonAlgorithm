package first_time;
//첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

import java.util.Scanner;

public class q1003 {
    static int zero=0, one=0;
    static int fibo_memo[][] = new int[40][2];

    static void fibonacci(int n){
        zero++;

        one++;
    }

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int fibo_num[][] = new int[num][3];

        for(int i = 0 ; i < num ; i++){
            fibo_num[i][0] = scan.nextInt();
        }



        for(int i = 0 ; i < num ; i++){
            System.out.println(fibo_num[i][1]+" "+fibo_num[i][2]);
        }
    }

}
