import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the word, numbers : etc :-");
        String original = sc.nextLine();
        String reversed ="";
        
        for(int i=original.length()-1; i>=0 ;i--){
            reversed += original.charAt(i);
        }
        
        if(original.equals(reversed)){
            System.out.println(original + " is a palindrom");
        } else{
            System.out.println(original + " is not a palindrom");
        }
        
        sc.close();
    }
    
}