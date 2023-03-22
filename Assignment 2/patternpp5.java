class patternpp5{
	public static void main(String args[]){
		int a=9;
		for(int i=a;i>=1;i--){
			for(int k=i;k>1;k--){
				System.out.print("  ");
			}
				for(int j=i;j<=a;j++){
					System.out.print(j+" ");
				}
				for(int j=a-1;j>=i;j--){
					System.out.print(j+" ");
				}
		System.out.println();
		}
		
	}
	
}
