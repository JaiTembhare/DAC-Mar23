/* 22. Write a program to find minimum and maximum number as well as
to add two long numbers using methods of Long.
*/
import java.util.Scanner;
class Que22{
    long a;
    long b;
    void acceptno(){
        System.out.println("Enter Two Number ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextLong();
        b=sc.nextLong();
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