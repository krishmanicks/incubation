import java.util.*;

class Ex4 {

	public static void main(String args[]) {
		
		String a = "I went on Everest this JAN";
		String b = "Higher sec exams are scheduled by MAR 2022";
		String c = "Hiroshima and Naga in 6th AUG 1945";
		String d = "Tn was reported on 7th MAR 2020";
		
		HashMap<Integer,String> hash1 = new HashMap<Integer,String>();  
		HashMap<Integer,String> hash2 = new HashMap<Integer,String>();  
		
		hash1.put(2021, a);
		hash1.put(2022, b);
		hash1.put(1945, c);
		hash1.put(2020, d);
		Integer ar1 [] = new Integer[4];
		
		for(Map.Entry i: hash1.entrySet()) {  
			String temp = (String) i.getValue();
			int var = 0;
			String arr[] = temp.split(" ");
			
			for(String j: arr) {
				
				if( j.equals("JAN"))
					hash2.put(2021, temp);
				else if(j.equals("2022"))
					hash2.put(2022, temp);
				else if(j.equals("1945"))
					hash2.put(190, temp);
				else if(j.equals("2020"))
					hash2.put(2020, temp);
			}
		 }  
		//System.out.println(hash2);
		for (Map.Entry i : hash1.entrySet())
	   {
		System.out.println(i.getKey() + " - " + i.getValue());
	   }

	}
}