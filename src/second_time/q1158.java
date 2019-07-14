//package second_time;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.Queue;

public class q1158{
  public static void main(String args[]) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int k = Integer.parseInt(st.nextToken());
    LinkedList<Integer> zose = new LinkedList<Integer>();
    int tmp = k-1;
    for(int i = 1 ; i <= n ; i++){
      zose.add(i);
    }
    System.out.print("<");
    for(int i = 0 ; i < n ; i++){ 
      System.out.print(zose.get(tmp));  
      zose.remove(tmp); 
      for(int j=0; j<k-1; j++){
        if(tmp >= zose.size())
          tmp = 1;
        else
          tmp += 1;
      }
      if(tmp ==zose.size()){
        tmp = 0;
      } 
      if(zose.size() != 0)
        System.out.print(", ");
    }
    System.out.print(">");
  }
}
