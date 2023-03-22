import java.util.Scanner;
class que3{
	public static int fact(int n){
		if(n==0){
			return 1;
		}else{
		return n*fact(n-1);
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number. ");
		int n = sc.nextInt();
		int result;
		result = fact(n);
		System.out.println("Factorial is "+result);
	}
}