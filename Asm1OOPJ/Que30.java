/* 30.Write a program to find minimum and maximum number as well as
to add two double numbers using methods of Doublw
*/
import java.util.Scanner;
class Que30{
    double a;
    double b;
    void acceptno(){
        System.out.println("Enter first Number ");
        Scanner sc = new Scanner(System.in);
        a=sc.nextDouble();
        System.out.println("Enter Second Number ");
        b=sc.nextDouble();
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