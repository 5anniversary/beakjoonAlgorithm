/*
    name : oh junhyeon
    Date : 2019/04/30
    URL : https://www.acmicpc.net/problem/2292
    문제 : 그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
          숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
          예를 들면, 13까지는 3개, 58까지는 5개를 지난다.
    입력 : 첫째 줄에 N(1 ≤ N ≤ 1,000,000,000)이 주어진다.
    출력 : 입력으로 주어진 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나는지 출력한다.
 */
package findRule;


import java.util.*;

public class q2292 {
    static void findHive(int num){
        int result, cannes;
        int n=2;
        if(num==1)
            result = 1;
        else{
            while(num>0){
                if(n==2)cannes = 6*(n-1)+1;
                else cannes = 6*(n-1);
                num = num-cannes;
                if(num>0) n++;
            }
            result = n;
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        findHive(num);

    }
}
