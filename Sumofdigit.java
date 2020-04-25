import java.util.*;
import java.lang.*;
import java.io.*;

class Sumofdigit {

    public static void main(String[] args)  throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       PrintWriter out = new PrintWriter(System.out); 
       int t = Integer.parseInt(br.readLine());
       while(t-->0)
       {
            int sum=0;
           int digit =Integer.parseInt(br.readLine());
           while(digit!=0)
           {
               
                int rem=digit%10;
                sum=sum+rem;
                digit=digit/10;

           }
           out.println(sum);
           out.flush();
       }
       out.close();
    }
}