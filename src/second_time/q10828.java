//package second_time;
//
import java.util.*;
import java.io.*;

public class q10828 {
  public static void main(String args[]) throws Exception{
    Stack<Integer> sk = new Stack<Integer>();
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    //int n = sc.nextInt();
    for(int i = 0 ; i < n ; i++){
      st = new StringTokenizer(br.readLine());
      String oi = st.nextToken();
      //String oi = sc.nextLine();
      //int io = sc.nextInt();
      switch(oi){
        case "push":
	        int io = Integer.parseInt(st.nextToken());
          sk.push(io);
//        push(io);
          break;
        case "pop":
          if(sk.isEmpty())
            System.out.println("-1");
          else
            System.out.println(sk.pop());
//        pop();
          break;
        case "size":
          System.out.println(sk.size());
//        size();
          break;
        case "empty":
    	    if(sk.isEmpty())
	          System.out.println("1");
	        else
	          System.out.println("0");
//        empty();
          break;
        case "top":
	        if(sk.isEmpty())
      		  System.out.println("-1");
   	      else
      		  System.out.println(sk.peek());
//        top();
        break;
      }
    }
  }
}
