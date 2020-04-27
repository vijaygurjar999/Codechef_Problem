
import java.util.*;
import java.lang.*;
import java.io.*;

class TheLeadgame {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t =Integer.parseInt(br.readLine());
        int Pscore_1=0;
        int Pscore_2=0;
        int maxlead=Integer.MIN_VALUE;
        int maxplayer=0;
        while(t-->0){
            String[] temp = br.readLine().split(" ");
            int [] input=new int[temp.length];
		for(int i=0;i<temp.length;i++){
		    input[i]=Integer.parseInt(temp[i]);
        }
            Pscore_1+=input[0];
            Pscore_2+=input[1];
            int tempplayer;
            int lead;
            if(Pscore_1>Pscore_2){
                tempplayer =1;
                lead =Pscore_1-Pscore_2;
                if(lead>maxlead){
                    maxlead=lead;
                    maxplayer=tempplayer;
                }
                else{
                    tempplayer=2;
                    lead =Pscore_2-Pscore_1;
                    if(lead>maxlead){
                        maxlead=lead;
                        maxplayer=tempplayer;
                    }
                }
            }
        //out.println(Pscore_1+" "+Pscore_2); 
       // out.println(Pscore_2);
        //out.flush();
        }
        out.println(maxplayer+" "+maxlead);
        out.flush();
        out.close(); 

}
}