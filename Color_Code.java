import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch=='v'){
            System.out.println("Violet");  
        }
        else if (ch=='V'){
          System.out.println("Violet");  
        }
        else if (ch=='I'){
            System.out.println("Indigo");  
        }
        else if (ch=='i'){
           System.out.println("Indigo");   
        }
        else if (ch=='b'){
            System.out.println("Blue");  
        }
        else if (ch=='B'){
            System.out.println("Blue");  
        }
        else if (ch=='g'){
            System.out.println("Green");  
        }
        else if (ch=='G'){
            System.out.println("Green");  
        }
        else if (ch=='y'){
         System.out.println("Yellow");     
        }
        else if (ch=='Y'){
            System.out.println("Yellow");  
        }
        else if (ch=='o'){
            System.out.println("Orange");  
        }
        else if (ch=='O'){
            System.out.println("Orange");  
        }
        else if (ch=='r'){
            System.out.println("Red");  
        }
        else if (ch=='R'){
            System.out.println("Red");  
        }
        else{
            System.out.println("-1");
        }
    }
}