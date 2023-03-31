/* Write a program to find minimum and maximum number as well as
to add two integer numbers using methods of Integer. */
import java.util.Scanner;
class Sum{
    int a;
    int b;
    void acceptno(){
        System.out.println("Enter Two Number ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void minmax(){
        if(a>b){
            System.out.println("Maximum number is "+a);
            System.out.println("Minimum number is "+b);
        }else{
            System.out.println("Maximum number is "+b);
            System.out.println("Minimum number is "+a);
        }
    }
    void sumNo(){
        System.out.println("Sum of two no is "+(a+b));
    }
    public static void main(String[] args){
        Sum s =new Sum();
        s.acceptno();
        s.minmax();
        s.sumNo();
    }
    
    
}