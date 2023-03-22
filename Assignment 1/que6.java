//Write a Java Program to find whether a given number is Leap year or NOT.
import java.util.Scanner;
class que6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year ");
		int yr = sc.nextInt();
		if(yr%4==0||(yr%400==0&&yr%100!=0)){
			System.out.println(yr+" is a leap year.");
		}else{
			System.out.println(yr+" is not a leap year.");
		}
		
	}
}