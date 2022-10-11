import java.util.*;

class Zoho {
	
	public static void main(String args[]) {
		
		String str = "WELCOMETOZOHOCORPORATION ";
		char s[][] = new char[5][5];
		
		int k=0;

		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				s[i][j] = str.charAt(k);
				k++;
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(s[i][j] == 'T') {
					if(i<=2) {
						if(s[i+1][j] == 'O' && s[i+2][j] == 'O') {
							System.out.println("Start index = " + i + " " +j);
							System.out.println("end index = " + (i+2) + " " + j);
							return;
						}
						if(j<=2) {
							if(s[i][j+1] == 'O' && s[i][j+2] == 'O') {
								System.out.println("Start index = " + i + " " + j);
								System.out.println("end index = " + i + " " + (j+2));
								return;
							}
						}
					}
					else {
						if(i>=2) {
							if(s[i-1][j] == 'O' && s[i-2][j] == 'O') {
								System.out.println("Start index = " + i + " " +j);
								System.out.println("end index = " + (i-2) + " " + j);
								return;
							}
							if(j>=2) {
								if(s[i][j-1] == 'O' && s[i][j-2] == 'O') {
									System.out.println("Start index = " +i + " " + j);
									System.out.println("end index = " + i + " " + (j-2));
									return;
								}
							}
						}
					}
				}
			}
		}
	}
}
