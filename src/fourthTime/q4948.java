//package fourthTime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class q4948{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int num, cnt=0;
    boolean isPrime;
    num = Integer.parseInt(br.readLine());
    while(num != 0){
      cnt = 0;
      for(int i = num+1 ; i <= 2*num ; i++){
        isPrime = true;
        for(int j = 2 ; j <= (int)Math.sqrt(i); j++){
          if(i % j == 0){
            isPrime = false;
            //System.out.println("if i의 값 : "+i);
            //System.out.println("if j의 값 : "+j);
            break;
          }
          /*else{
            System.out.println("else i의 값 : "+i);
            System.out.println("else j의 값 : "+j);
            cnt++;
          }*/
        }
        if(isPrime)
          cnt++;
      }
      //bw.write(cnt+"\n");
      System.out.println(cnt);
      num = Integer.parseInt(br.readLine());
    }
    //bw.flush();
    //bw.close();
  }
}
