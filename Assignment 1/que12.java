import java.util.Scanner;
class withouto{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(y==0){
			System.out.println(x);
		}
		else{
			while(y!=0){
				int carry=x&y;
				System.out.println(carry);
				
				x=x^y;
				
				y=carry<<1;
			
				
			}
			System.out.println("Sum is "+x);
		}
		
	}
}