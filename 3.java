import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the word :-");
        String input= sc.nextLine();
        
        int count=0;
        
        input = input.toLowerCase();

        for(int i=0; i< input.length()-1; i++){
            char ch = input.charAt(i);
            
            if( ch== 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        
        System.out.println("Number of vowels in the string :" + count);
    }
}