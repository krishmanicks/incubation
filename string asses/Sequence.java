import java.util.*;

class Sequence
{
    public static int compare(int[] a,int[] b)
	{
        int i=0,j=0,count=0;
		
        while(i<a.length && j<b.length)
		{
            if(a[i]==b[j])
			{
                count++;
                i++;
                j++;
            }
			else if(a[i]<b[j])
			{
                i++;
            }
			else{
                j++;
            }
        }
        return count;
    }
	public static void main (String[] args)
	{
		HashMap<Integer,int[]> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int[] arr = new int[n];
		    int j=0;
		    for(j=0;j<n;j++)
			{
		        arr[j] = sc.nextInt();
		    }
		    Arrays.sort(arr);
		    map.put(i,arr);
		}
		
		int result=1,count=0;
		Stack<int[]> st = new Stack<>();
		st.push(map.get(0));
		
		while(!st.isEmpty())
		{
		    int[] ele = st.pop();
		    for(int j=1;j<t;j++)
			{
		        int val = 0;

				val = compare(map.get(j),ele);

		        if(val>=k)
				{
		            st.push(map.get(j));
		            map.remove(j);
		            result++;
		        }
		    }
		}
		System.out.println(result);
	}
}