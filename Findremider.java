import java.util.*;
import java.lang.*;
import java.io.*;
class Findremider {
    public static void main(String[] args) throws java.lang.Exception
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out); 
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            String[] temp = br.readLine().split(" ");
            int[] input=new int[temp.length];

            for(int i=0;i<temp.length;i++){
                input[i]=Integer.parseInt(temp[i]);
            }

            int a = input[0];
            int b = input[1];
            int rem=a%b;
            out.println(rem);
            out.flush();
            t--;
        }
        out.close();
    }

}