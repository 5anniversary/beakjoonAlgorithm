//package second_time;

import java.util.*;
import java.io.*;

public class q3986{

  public static void main(String args[]) throws Exception{
    String st = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer s = new StringTokenizer(br.readLine());
    int cnt = 0;
    int n = Integer.parseInt(s.nextToken());
    for(int i = 0 ; i < n ; i++){
      String word = br.readLine();
      st += word.substring(0, 1);
      for(int  j = 1 ; j < word.length() ; j++){
        if((st.substring(st.length()-1, st.length())) == word.substring(j,j+1))
          st += word.substring(j, j+1);
        else
          break;
      }
      if(st.length() == word.length())
        cnt++;
    }
    System.out.println(cnt);
  }
}
