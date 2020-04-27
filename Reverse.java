import java.io.*;
import java.lang.*;
import java.util.*;
class Reverse {
    
    public static void main(String[] args) throws java.lang.Exception
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out = new PrintWriter(System.out);
     int t = Integer.parseInt(br.readLine());
     while(t-->0){
        StringBuilder input1 = new StringBuilder();
         String num1= br.readLine();
         input1.append(num1);
         input1=input1.reverse();
        int x =Integer.parseInt(input1.toString());
         //out.println(Integer.parseInt(input1));
         out.println(x);
         out.flush();
     }
     out.close();
    }

}