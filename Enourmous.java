import java.util.*;
import java.lang.*;
import java.io.*;
class Enourmous {
    public static void main(String[] args)  throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out); 
        String[] temp = br.readLine().split(" ");
        int [] input=new int[temp.length];
        for(int i=0;i<temp.length;i++){
		    input[i]=Integer.parseInt(temp[i]);
        }
        int start=input[0]; 
        int factor=input[1];
        int temp1 = start;
        int count=0;
        while(temp1!=0){
            int x=Integer.parseInt(br.readLine());
            if(x%factor==0){
                count++;
                
            }
            temp1--;
            
        }
        out.println(count);
        out.flush();
        out.close();
        
    }

}