import java.util.*;

class interest{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        double p =sc.nextFloat(),r=sc.nextFloat(),t=sc.nextFloat();
        double ci=(p*Math.pow((1+r/100),t));
        System.out.format("%.2f",ci);
    }
}