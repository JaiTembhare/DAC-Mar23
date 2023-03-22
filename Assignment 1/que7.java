//Q7.Write a Java Program to Print 1 To 10 Without Using Loop. 
class que7{
	public static void loop(int n){
		if(n<=10){
			System.out.println(n+" ");
			loop(n+1);
		}
		
		
	
	}
	public static void main(String args[]){
		int i = 1;
		loop(i);
	}
}