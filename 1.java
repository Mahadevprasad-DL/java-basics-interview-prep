import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Strings :-");
        String input = sc.nextLine();  // store a strings
        String reversed = " ";        // reversed 
        
        for (int i =input.length()-1 ; i>=0; i--){   
            reversed += input.charAt(i);     // check each string
        }
        
        System.out.println("Reversed String are :-" + reversed);
    }
}

// input.length() - 1: last index

// i >= 0: continues until the first character

