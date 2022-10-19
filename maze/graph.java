import java.util.*;

class graph {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
		int fir=0;
		int sec=0;
		for(int i=0;i<k;i++) {
			fir=sc.nextInt();
			sec=sc.nextInt();
			if(map.containsKey(fir)){
				ArrayList<Integer> a = map.get(fir);
				a.add(sec);
				map.put(fir,a);
			}
			else{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(sec);
				map.put(fir,a);
			}
			if(map.containsKey(sec)){
				ArrayList<Integer> a = map.get(sec);
				a.add(fir);
				map.put(sec,a);
			}
			else{
				ArrayList<Integer> a=new ArrayList<>();
				a.add(fir);
				map.put(sec,a);
			}
			
		}
		boolean []vist=new boolean[n+1];
		Arrays.fill(vist,true);
		Queue<Integer> q= new LinkedList<>();
		q.offer(1);
		int dis=0;
		vist[1]=false;
		while(!q.isEmpty()){
			boolean flag=false;
			int len=q.size();
			for(int i=0;i<len;i++){
				ArrayList<Integer> l = map.get(q.poll());
				for(int x:l){
					if(vist[x]==true){
						vist[x]=false;
						q.offer(x);
						flag=true;
					}
				}	
			}
			if(flag){dis++;}
		}
		System.out.println(dis);
		
	}
}