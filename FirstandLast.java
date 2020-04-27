import java.io.*;
import java.lang.*;
import java.util.*;
class FirstandLast {
    public static void main(String[] args) throws java.lang.Exception
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out = new PrintWriter(System.out);
     int t = Integer.parseInt(br.readLine());

     while(t!=0){
         String [] temp= br.readLine().split("");
         int first=Integer.parseInt(temp[0]);
         int last=Integer.parseInt(temp[temp.length-1]);
         int sum=first+last;
         out.println(sum);
         out.flush();
         t--;
     }
     out.close();
        
    }
}