import java.util.*;

class LargestWords {  

    public static void main(String[] args) {  
	
        String string = "Big black bug bit a big black dog on his big black nose ewfhiujeiuf jfri";  
        int count;  
        int min = 0;
        int max = 0;
		
        string = string.toLowerCase();  
          
        String words[] = string.split(" ");  
          
			System.out.println(Arrays.toString(words));
        for(int i = 0; i < words.length; i++) 
		{
            if(words[i].length() < words[min].length())
			{	//System.out.println(words[i]);
				min = i;
			}
			
			if(words[i].length() >words[ max].length()) 
				max = i;
        }  
		System.out.println("Smallest word - " + words[min]);
		System.out.println("largest word - " + words[max]);
    }  
}  