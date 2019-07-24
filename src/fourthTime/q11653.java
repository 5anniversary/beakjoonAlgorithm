//package fourthTime;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class q11653{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int num = Integer.parseInt(br.readLine());
    int i=2;
    while(num >= i){
      if(num%i==0){
        num = num/i;
        System.out.println(i);
      }
      else
        i++;
    }
  }
}
