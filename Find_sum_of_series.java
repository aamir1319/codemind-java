import java.util.*;

class sum{
    public  static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n =sc.nextInt();
        float s = 0;
        for(float i=1; i<=n; i++){
            s=s+(1/i);
        }
        System.out.format("%.2f",s);
    }
}