public class FillWhiteSpace{    

    public static void main(String[] args) {    
            
        String str1="Replacing the white spaces with the number 0";    
               
        str1 = str1.replaceAll("\\s+", "0");    
            
        System.out.println("String after removing all the white spaces : " + str1);    
    }    
} 