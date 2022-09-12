class MinEachRow {

    public static void main(String[] args) {
        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 4}, {5, 6, 4} };

        int min[] = new int[10];


	System.out.println("The matrix is: ");
        
		for(int i=0;i<row;i++) {
			int mins = Integer.MAX_VALUE;
			int index = 0;
			for(int j=0;j<column;j++) {
				// if(mins > matrix[i][j]) {
					// min[]
					// mins = matrix[i][j];
					// index = ;
				// }
				min[matrix[i][j]]++;
			}		
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(min[i] + "   " + i);
		}
	}
 
}