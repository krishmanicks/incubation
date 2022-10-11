import java.util.*;

class Olya {

	public static void main(String []args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cases");
		int t = sc.nextInt();
		
		while(t-- > 0) {
			String s = sc.next();
			char arr[] = s.toCharArray();
			int n = arr.length;
			
			int count = 0;
			
			 for (int i=0;i<n;i++)
				{
				for (int j=i+1;j<n;j++)
				{
					if (arr[i] < arr[j])
					{
						char temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						count++;
					}
				}
        }
			System.out.println(count);
    }
								
		}
	}