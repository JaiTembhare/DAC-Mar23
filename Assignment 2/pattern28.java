class pattern28{
	public static void main(String args[]){
		//forword
		for(int i=1;i<=5;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//reverse
		
		for(int i=1;i<=5;i++){
			for(int j=4;j>=i;j--){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
}
