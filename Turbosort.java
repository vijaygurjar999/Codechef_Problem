import java.io.*;
import java.lang.*;
class Turbosort {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        int[]arr=new int[t];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        for(int k=1;k<arr.length;k++){
            for(int j =0;j<arr.length-k;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int x=0;x<arr.length;x++){
            out.println(arr[x]);
            out.flush();
        }
        out.close();
    }

}