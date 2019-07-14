package first_time;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Arrays;


public class q1260 {

    static void dfs(boolean g[][], int n, int m, int v){
        System.out.print(v);
        StringBuffer s = new StringBuffer();
        int i=0, j=0;
        while (i<n){
            while (j<n){
                if(g[i][j]==true) {
                    i += 1;
                    s.append(i+" ");
                }else if(g[i][j]==false){
                    i += 1;
                }
            }
        }
    }

    static void bfs(boolean g[][], int n, int m, int v){

    }

    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m, v;
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        boolean graph[][] = new boolean[n][n];
        int m1, m2;

        for (int i = m ; i >= 0 ; i --){
            st = new StringTokenizer(br.readLine());
            m1 = Integer.parseInt(st.nextToken());
            m2 = Integer.parseInt(st.nextToken());
            graph[m1-1][m2-1] = true;
            graph[m2-1][m1-1] = true;
        }

        dfs(graph, n, m, v);
        bfs(graph, n, m, v);
    }
}
