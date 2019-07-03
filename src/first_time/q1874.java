package first_time;

import java.io.InputStreamReader;
import java.io.BufferedReader;


public class q1874 {

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int inp[] = new int[n];
        for (int i = 0 ; i < n; i++){
            inp[i] = Integer.parseInt(br.readLine());
        }
    }
}
