/* 26.Write a program to find minimum and maximum number as well as
to add two float numbers using methods of Float.
*/
import java.util.Scanner;
class Que26{
    float a;
    float b;
    void acceptno(){
        System.out.println("Enter Two Number ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextFloat();
            
        b=sc.nextFloat();
    }
    void minmax(){
        if((float)a>b){
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
    public static void main(String[] args)  {
        Sum s =new Sum();
        s.acceptno();
        s.minmax();
        s.sumNo();
    }
    
    
}