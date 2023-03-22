class pattern110{
	public static void main(String args[]){
		int a=69;
		for(int i=a;i>=65;i--){
			for(int k=65;k<=i;k++){
				System.out.print(" ");
			}
			for(int j=a;j>=i;j--){
					System.out.print((char)j+" ");
				}
			System.out.println();
		}
	}
}