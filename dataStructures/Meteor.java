import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


class Meteor
 {
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer stz;
	static PrintWriter pw=new PrintWriter(System.out);
	public static void main(String args[]) throws IOException
	{
		stz=new StringTokenizer(bf.readLine());
		int n=Integer.parseInt(stz.nextToken());
		int m=Integer.parseInt(stz.nextToken());
		int k=Integer.parseInt(stz.nextToken());
		int g[][]=new int[1<<10][1<<10];
		int up[][]=new int[1<<10][1<<10];
		int dp[][]=new int[1<<10][1<<10];
		int ans[][]=new int[1<<10][1<<10];
		for(int i=1;i<=n;i++){
			Arrays.fill(g[i],1,m+1,1);
			g[i][m+1]=0;
		}
		for(int i=0;i<k;i++)
		{
			stz=new StringTokenizer(bf.readLine());
			g[Integer.parseInt(stz.nextToken())][Integer.parseInt(stz.nextToken())]=0;
		}
		for(int i=1;i<=m;i++)
			up[1][i]=g[1][i];
		for(int i=2;i<=n;i++)
			for(int j=1;j<=m;j++)
				up[i][j]=(g[i][j]==0?0:1+up[i-1][j]);
		int[] q=new int[1<<10];
		int[] p=new int[1<<10];
		int s;
		for(int i=1;i<=n;i++)
		{
			p[1]=q[1]=0;s=1;
			for(int j=1;j<=m+1;j++){
				while(q[s]>=up[i][j] && s>=1)
				{
					dp[i-q[s]+1][i]=Math.max(dp[i-q[s]+1][i],j-p[s-1]-1);--s;
					}
				++s;
				q[s]=up[i][j];p[s]=j;
			}
		}
		for(int i=1;i<=n;i++)
			for(int j=i;j<=n;j++)
				dp[i][j]=Math.max(dp[i][j], dp[i-1][j]);
		for(int i=n;i>0;i--)
			for(int j=i;j<=n;j++)
			{
				ans[i][j]=Math.max(ans[i][j-1],Math.max(ans[i+1][j], dp[i][j]*(j-i+1)));
				if(i+1<=j-1)
					ans[i][j]=Math.max(ans[i][j], ans[i+1][j-1]);
						
			}
		int query=Integer.parseInt(bf.readLine());
		for(int i=0;i<query;i++){
			stz=new StringTokenizer(bf.readLine());
			pw.println(ans[Integer.parseInt(stz.nextToken())][Integer.parseInt(stz.nextToken())]);
		}
		pw.flush();
		pw.close();
	}
}