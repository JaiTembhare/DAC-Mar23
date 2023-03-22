class patternpp4{
	public static void main(String args[]){
		for(int i=1;i<=9;i++){
			for(int k=9;k>=i;k--){
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++){
				
			System.out.print(j+" ");				
			}
			for(int h=i-1;h>=1;h--){
				if(i==1){
					continue;
				}else{
				System.out.print(h+" ");
				}
			}
			
			System.out.println();
			
		}
		
	}
	
}
