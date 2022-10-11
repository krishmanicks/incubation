import java.util.*;

class BallBrick {
	
	public static void dire(char matrix[][], int temp, int i, int n, char d) {
		
		if(d == 'N') {
			for(int k=i-1;;k++) {
				if(matrix[i][temp] >= '0' && matrix[i][temp] != 0) {
					matrix[i][temp] = 0;
					break;
				}
			}
		}
		
		else if(d == 'S') {
			for(int k=i+1;;k--) {
				if(matrix[i][temp] >= '0' && matrix[i][temp] != 0) {
					matrix[i][temp] = 0;
					if(k == n-1)
						break;
				}
			}
		}
		else if(d == 'e') {
			for(int k=temp;k<n;k++) {
				if(matrix[i][k] >= '0' && matrix[i][k] != 0) {
					matrix[i][k] = 0;
					break;
				}
			}
		}
		else if(d == 'W') {
			for(int k=temp;k>0;k--) {
				if(matrix[i][k] >= '0' && matrix[i][k] != 0) {
					matrix[i][k] = 0;
					break;
				}
			}
		}
	}
	
	public static void printing(char matrix[][], int n, int pos) {
		
		boolean istrue = true;				
		System.out.println("Enter the ball count");
		Scanner sc = new Scanner(System.in);
		int ball = sc.nextInt();
		
		int temp = 0;
		int start = 0;
		char end;
		int center = pos;
		
		while(ball > 0) {
			
			System.out.println(matrix[n-1][pos]);
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Ball Count: " + ball);
			System.out.println("\nEnter the direction in which the ball need to traverse ");
			String direction = sc.next();
			
			if(direction.equals("LD"))
				temp = pos-1;
			else if(direction.equals("RD"))
				temp = pos+1;
			else 
				temp = pos;
			int i=0;
			for(i=n-2;i>=0;i--) {

				if(matrix[i][temp] == 'W' && i == 0) {
					break;
				}
				else if(matrix[i][temp] == 'W' && ((i != 0))) {
					if(direction.equals("LD")) {
						for(int k=i;k<n;k++) {
							//for(int j=pos;j<n;j++) {
							if(matrix[i][k] == 'W') {
								break;
							}
							if(matrix[i][k] == 'D') {
								matrix[i][temp] = 0;
								ball++;
								break;
							}
							if(matrix[i][k] == 'N' || matrix[i][k] == 'S' || matrix[i][k] == 'W' || matrix[i][temp] == 'e' ) {
								char d = matrix[i][temp];
								dire(matrix,temp,i,n,d);
								break;
							}
							if(matrix[i][temp] == 'E') {
								matrix[i][temp] = 0;
								for(int x=1;i<n-1;i++) {
									matrix[x][i] = 0;
								}
								break;
							}
							if(matrix[i][k] > '0' && matrix[i][k] != 0) {
								start = (int)matrix[i][temp];
								if(start == 1 || matrix[i][temp] == '1') {
									matrix[i][temp] = 0; 
									break;
								}
								start--;
								end = (char)start;
								matrix[i][temp] = (char)start;
								break;
							}
							//}
						}
					}
				else
				{
					for(int k=pos;k>=0;k++) {
						if(matrix[i][k] == 'W') {
							break;
						}
							if(matrix[i][temp] == 'E') {
								matrix[i][temp] = 0;
								for(int x=1;i<n-1;i++) {
									matrix[x][i] = 0;
								}
								break;
							}
							if(matrix[i][k] == 'D') {
								matrix[i][temp] = 0;
								ball++;
								break;
							}
							if(matrix[i][k] == 'N' || matrix[i][k] == 'S' || matrix[i][k] == 'W' || matrix[i][temp] == 'e' ) {
								char d = matrix[i][temp];
								dire(matrix,temp,i,n,d);
								break;
							}
							
						if(matrix[i][k] >= '0' && matrix[i][k] != 0) {
							start = (int)matrix[i][temp];
							if(start == 1 || matrix[i][temp] == '1') {
								matrix[i][temp] = 0; 
								break;
							}
							start--;
							end = (char)start;
							matrix[i][temp] = (char)start;
							break;
						}
					}
				}					
					break;
				}
				
				if(matrix[i][temp] == 'D') {
					matrix[i][temp] = 0;
					ball++;
					break;
				}
				if(matrix[i][temp] == 'E') {
					matrix[i][temp] = 0;
					for(int x=1;i<n-1;i++) {
						matrix[x][i] = 0;
					}
					break;
				}
				
				if(matrix[i][temp] == 'N' || matrix[i][temp] == 'S' || matrix[i][temp] == 'W' || matrix[i][temp] == 'e' ) {
					char d = matrix[i][temp];
					dire(matrix,temp,i,n,d);
					break;
				}
				
				if(matrix[i][temp] == 'S') {
					matrix[i][temp] = 0;
					matrix[i-1][temp] = 0;
					matrix[i-1][temp-1] = 0;
					matrix[i-1][temp+1] = 0;
					matrix[i+1][temp+1] = 0;
					matrix[i][temp-1] = 0;
					matrix[i][temp+1] = 0;
					matrix[i+1][temp+1] = 0;
					matrix[i+1][temp-1] = 0;
					break;
				}
				
				if(matrix[i][temp] >= '0' && matrix[i][temp] != 0) {
					start = (int)matrix[i][temp];
					if(start == 1 || matrix[i][temp] == '1') {
						matrix[i][temp] = 0; 
						break;
					}
					start--;
					end = (char)start;
					matrix[i][temp] = (char)start;
					break;
				}
			}
				matrix[n-1][pos] = 'G';
				if(center != pos) 
					ball--;
				pos = temp;
				matrix[n-1][pos] = 'O';
				
				if(ball == 0) {
					System.out.println("\n------------------You Lost!!!  Try again!-----------------");
					break;
				}
		}
		
	}
	
	public static void fill(char matrix[][], int n) {
		Scanner sc = new Scanner(System.in);
		char str = 'Y';
		while(str != 'N') {
			System.out.print("Enter the brick's position and the brick type: ");
			int i = sc.nextInt();
			int j = sc.nextInt();
			char val = sc.next().charAt(0);
			
			matrix[i][j] = val;
			
			System.out.print("Do you want to continue(Y or N)? ");
			char temp = sc.next().charAt(0);
			str = temp;
		}
	}
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of the NxN Matrix");
		int N = sc.nextInt();
		char matrix[][] = new char[N][N];
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(i==0 || j==0 || j==N-1) {
					matrix[i][j] = 'W';
				}
				if(i==N-1 && j>=1 && j<=N-2) {
					matrix[i][j] = 'G';
				}
				if(i==N-1 && j==N/2) {
					matrix[i][j] = 'O';
				}
			}
		}		
		fill(matrix,N);
		printing(matrix,N,N/2);
		
	}
}