//package third_time;

import java.util.*;
import java.io.*;

public class q4949{

  public static void main(String args[]) throws Exception {
    Stack<Character> list = new Stack<Character>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String st;
    while(true){
      st = br.readLine();
      if(st.equals(".")){
        bw.flush();
        bw.close();
        return;
      }
      for(char ch : st.toCharArray()){
        switch (ch){
          case '[':
           list.push(ch); 
           break;
          case '(':
           list.push(ch);
           break;
          case ']':
           if( list.isEmpty() || !list.peek().equals('[')) { list.push(ch); }
           else { list.pop(); }
           break;
          case ')':
           if( list.isEmpty() || !list.peek().equals('(') ){ list.push(ch); }
           else{ list.pop(); }
           break;
          }
        }
      if(!list.isEmpty())
        System.out.println("no");
      else
        System.out.println("yes");
      list.clear();
    } 
  }
}
