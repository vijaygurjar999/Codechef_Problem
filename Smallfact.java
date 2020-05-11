import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;

class Smallfact {

    public static void main(String[] args)  throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out); 
        int t = Integer.parseInt(br.readLine());
        while(t!=0){
            int x =Integer.parseInt(br.readLine());
            BigInteger fact= new BigInteger("1");
            //if(x==)
            while(x>=1){
                fact=fact.multiply(BigInteger.valueOf(x));
                x--;
            }
            t--;
            out.println(fact);
            out.flush();
        }
        out.close();
    }
}
