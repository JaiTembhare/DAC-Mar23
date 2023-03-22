class pattern210r{
	public static void main(String args[]){
		//forword
		/*
		for(int i=1;i<=5;i++){
			for(int k=6;k>i;k--){
				System.out.print(" ");
			}
			for(int j=1;j<=5;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		
		//reverse
		
		for(int i=1;i<=5;i++){
			for(int k=1;k<i;k++){
				System.out.print("  ");
			}
			for(int j=1;j<=5;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
}
