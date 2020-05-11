import java.io.*;
import java.util.*;
import java.lang.*;

class SecondLargest{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String [] temp= br.readLine().split(" ");
            int [] input = new int[temp.length];
            for(int i =0; i<temp.length;i++){
                input[i]=Integer.parseInt(temp[i]);
            }
            Arrays.sort(input);
            out.println(input[1]);
            out.flush();  
    }
    out.close();
}
}