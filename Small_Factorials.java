import java.util.*;

class small{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i =0; i<n;i++){
            int a =sc.nextInt();
            int fact=1;
            for(int j=1;j<=a;j++){
                fact=fact*j;
            }
            System.out.println(fact);
        }
    }
}