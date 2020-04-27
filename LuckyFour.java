import java.io.*;
import java.lang.*;
import java.util.*;
class LuckyFour {

    public static void main(String[] args) throws java.lang.Exception
    {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     PrintWriter out = new PrintWriter(System.out);
     int t = Integer.parseInt(br.readLine());
     while(t-->0){
         int x = Integer.parseInt(br.readLine());
         //int temp=x;
         int cout=0;
         while(x!=0){
             
             int last = x%10;
             if(last==4){
                 cout++;
             }
             x=x/10;
         }
         out.println(cout);
         out.flush();
     }
     out.close();
    }
}
