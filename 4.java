import java.util.Scanner;

public class Main{
    public static int factorical(int n){
        if(  n==0 || n==1){
            return 1;
        } else{
            return n*factorical(n-1);
        }
    }
    
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the number : ");
    int number = sc.nextInt();
    
    if(number < 0){
        System.out.println("0 is not valid");
    } else{
        int result = factorical(number);
        System.out.println("Factoriacl of " + number + " is "+ result);
    }
    
    sc.close();
}
}