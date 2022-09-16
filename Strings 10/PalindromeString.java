public class PalindromeString    
{    
    public static void main(String[] args) {   
	
        String string = "Kayaks";    
        boolean flag = true;    
              
        string = string.toLowerCase();    
        int i=0,j=string.length() - 1;
		
        while(i<=j) {    
            if(string.charAt(i) != string.charAt(string.length()-i-1)) {    
                flag = false;    
                break;    
            }
				i++;
				j--;
        }    
        if(flag)    
            System.out.println("Given string is palindrome");    
        else    
            System.out.println("Given string is not a palindrome");    
    }    
}  