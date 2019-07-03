/*
    name : oh junhyeon
    Date : 2019/05/14
    URL : https://www.acmicpc.net/problem/1978
    문제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
    입력 : 첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
    출력 : 주어진 수들 중 소수의 개수를 출력한다.
 */
// n을 입력받고, n개 입력

package decimal;

import java.util.Scanner;

public class q1978 {
    public static void main(String[]  args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] decimal = new int[n];
        int cnt = 0, i = 0, j = 0;
        for (i = 0; i < n; i++) {
            decimal[i] = scan.nextInt();
        }
        for (i = 0; i < n; i++) {
            for (j = 2; j < decimal[i]; j++) {
                if (decimal[i] % j == 0) {
                    break;
                }
            }
            if (decimal[i] == j)
                cnt += 1;
        }
        System.out.print(cnt);
    }

}
