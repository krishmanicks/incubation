import java.util.*;
import java.io.*;


class Management {
	
	public static void main(String args[]) throws IOException {
		
		HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		boolean istrue = true;
		int id = 1;
		System.out.println("\t\t Student Management\n\n");
		File f1 = new File("RaviBoomer.txt");
		if(!f1.exists()){
			f1.createNewFile();
		}
		String stud = ("id" + "\t\t" + "name" + "\t\t" + "maths" + "\t\t" + "physics" + "\t\t" + "science" + "\t\t" + "tamil" +"\t\t"  + "social" + "\t\t" + "total" + "\t\t" + "avg\n\n");
		FileWriter fw = new FileWriter(f1,true);

		hash.put("name", 1);
		hash.put("maths", 2);
		hash.put("tamil", 5);
		hash.put("physics",3);
		hash.put("science", 4);
		hash.put("social", 6);
		hash.put("id",0);
		// fw.write(stud);

		fw.flush();

		
		while(istrue) {
			
			System.out.println("1. Create students");
			System.out.println("2. display students");
			System.out.println("3. modify students");
			System.out.println("4. Exit");
			
			int ch = sc.nextInt();
			
			
			switch(ch) {
				case 1: {
					System.out.println("Enter name and the marks(Mat,phy,sci,tam,soc)");
					String name = sc.next();
					int maths = sc.nextInt();
					int phy = sc.nextInt();
					int science = sc.nextInt();
					int tamil = sc.nextInt();
					int social = sc.nextInt();
					int total = (maths+phy+science+tamil+social);
					double avg = total/5;
					String student = (id + "\t\t" + name + "\t\t" + maths + "\t\t" + phy + "\t\t" + science + "\t\t" + tamil +"\t\t"  + social + "\t\t" + total + "\t\t" + avg + "\n\n");
					fw.write(student);
					id++;
					fw.flush();
					break;
				}
				
				case 2: 
				{
					Scanner obj = new Scanner(f1);
					System.out.println("enter the userid");
					System.out.println("id" + "\t\t" + "name" + "\t\t" + "maths" + "\t\t" + "physics" + "\t\t" + "science" + "\t\t" + "tamil" +"\t\t"  + "social" + "\t\t" + "total" + "\t\t" + "avg\n\n");
					while(obj.hasNextLine()) {
						System.out.println(obj.nextLine());				
					}
				}
				break;
					
				case 3:
					Scanner obj = new Scanner(f1);
					boolean flag = true;
					System.out.println("enter the userid");
					String s1 = Integer.toString(sc.nextInt());
					String temp = "Oops! No Data found";
					while(obj.hasNextLine() && flag) {
						temp = obj.nextLine();
						String arr[] = temp.split("\t\t");
						if(s1.equals(arr[0])) {
							flag = false;
						}
						
					}
					if(!flag){		
					
						System.out.println("id" + "\t\t" + "name" + "\t\t" + "maths" + "\t\t" + "physics" + "\t\t" + "science" + "\t\t" + "tamil" +"\t\t"  + "social" + "\t\t" + "total" + "\t\t" + "avg\n");
						System.out.println(temp);
						System.out.println("Do you want to Modify this (1/0) ");
						int t=sc.nextInt();
						if(t==1){
							File f2 = new File("tmp.txt");
							FileWriter fw2 = new FileWriter(f2);
							f2.createNewFile();
							System.out.println("Enter the modification heading");
							int index = hash.get(sc.next());

							String []arr = temp.split("\t\t");
							System.out.println("Enter the new vlaue");
							String tr=sc.next();
							if(index!=0 && index!=1 && index!=7 && index!=8){
								arr[7] = ""+(Integer.parseInt(arr[7])-Integer.parseInt(arr[index]) + Integer.parseInt(tr));
								arr[index] = ""+Integer.parseInt(tr);
								arr[8]=""+Integer.parseInt(arr[7])/5;	
							}
							else if(index==1 || index==0){
								arr[index] = tr;
							}
							int len=arr.length;
							String line="";
							for(int i=0;i<len;i++){
								line+=arr[i]+"\t\t";
							}
							line+="\n";
							obj=new Scanner(f1);
							
							while(obj.hasNextLine()) {
								String tm = obj.nextLine();
								String arr2[] = tm.split("\t\t");
								if(temp.equals(tm)) {
									fw2.write(line+"\n");
								}					
								else{
									fw2.write(tm+"\n");
								}
							}
							fw2.flush();
							fw.flush();
							fw=new FileWriter(f1);
							Scanner obj2 = new Scanner(f2);
							
							while(obj2.hasNextLine()) {
								String tm = obj2.nextLine();
								
								fw.write(tm+"\n");
							}
							fw2.close();
							fw.flush();
							obj2.close();

						}
						
					}
					else{
						System.out.println(temp);	
					}
					obj.close();
					break;
				
				case 4:
					istrue = false;
					break;
			}
			
		}
		fw.close();
	}
}