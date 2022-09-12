class Missing {

	static void miss(int arr[]) {
		
		int size = arr.length;
		int hash[] = new int[size+1];
		
		
		for(int i=1;i<size+1;i++) {
			hash[i] = -1;
		}
		
		for(int i=1;i<size;i++) {
			hash[arr[i]]++;
		}
		
		for(int i=1;i<size+1;i++) {
			if(hash[i] == -1) 
				System.out.println(i);
		}
	}
	
	public static void main(String args[]) {
		
		int arr[] = {7,2,4,1,6,5,3};
		miss(arr);
	}
}