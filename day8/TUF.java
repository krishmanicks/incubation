import java.util.*;
class TUF {
static int countPlatforms(int n,int arr[],int dep[])
 {
    int ans=1;
    for(int i=0;i<=n-1;i++)
    {
        int count=1; 
        for(int j=i+1;j<=n-1;j++)
        {
            if((arr[i]>=arr[j] && arr[i]<=dep[j]) ||
           (arr[j]>=arr[i] && arr[j]<=dep[i]))
           {
               count++;
           }
        }
        ans=Math.max(ans,count);
    }
    return ans;
 }
 
 
public static void main (String[] args) {
		
		int[] dep ={1, 10, 15};
		int[] arr={1, 10, 3};
		int n=arr.length;
		int totalCount=countPlatforms(n,arr,dep);
		System.out.println("Minimum number of Platforms required "+totalCount);
	}
}