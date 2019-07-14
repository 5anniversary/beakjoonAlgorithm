package first_time;

import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//public class q1003_1 {
//    static int one=0, two=0;
//
//    public static int fibonacci(int n){
//        if(n==0) {
//            one++;
//            return 0;
//        }else if(n==1){
//            two++;
//            return 1;
//        }else{
//            return fibonacci(n-1) + fibonacci(n-2);
//        }
//    }
//
//    public static void main(String args[]) throws  Exception{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        for(int i = Integer.parseInt(br.readLine()) ; i > 0 ; i--) {
//            int num = Integer.parseInt(br.readLine());
//            fibonacci(num);
//            System.out.println(one+" "+two);
//            one = 0; two=0;
//        }
//    }
//
//}
public class q1003_1 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        for (int i=0 ; i<num ; i++){
            int n = scan.nextInt();
            System.out.println(fibo(n)+" "+fibo(n+1));
        }
    }

    static int fibo(int n){
        if(n==0) return 1;
        if(n==1) return 0;

        int a=1;
        int b=0;
        int c=1;
        for (int i=0 ; i<n-2; i++){
            a=b;
            b=c;
            c=a+b;
        }
        return c;
    }
}
