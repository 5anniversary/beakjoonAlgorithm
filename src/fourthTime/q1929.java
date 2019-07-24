//package fourthTime;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class q1929{

  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int max, min;
    boolean isPrime;
    min = Integer.parseInt(st.nextToken());
    max = Integer.parseInt(st.nextToken());
    for(int i = min ; i<=max ; i++){
      isPrime = true;
      for(int j=2; j<=(int)Math.sqrt(i); j++){
        if(i%j==0){
          isPrime = false;
          break;
        }
      }
      if(isPrime && i!=1){
        System.out.println(i);
      }
    }
    //bw.close();
    //
  }
}
