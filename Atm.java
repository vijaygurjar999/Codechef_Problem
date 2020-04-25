import java.util.*;
class Atm{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float x=s.nextFloat();
        float y=s.nextFloat();
   // public static flaot getBalance(float x,float y) {
        if(x%5==0&&y>(x+0.50f)){
            float reaming= y-x;
            reaming=reaming-0.50f;
            System.out.println(String.format("%.2f",reaming));
        }
        else{
            System.out.println(String.format("%.2f",y));
        }
        s.close();
    }
}