/* 
 * 
 * author : arda282
 * 
 */

import java.util.Scanner;

public class First {
    
    
    public static void toplama(int a, int b){
        int toplam = a+b;
        System.out.println("sum = " + toplam);
    }
    
    public static void cikarma(int a, int b){
        int fark = a-b;
        System.out.println("subtraction = " + fark);
    }
    
    public static void carpma(int a, int b){
        int carpim = a*b;
        System.out.println("multiplication = " + carpim);
    }
    
    public static void bolme(int a, int b){
        int bolum = a/b;
        System.out.println("divide = " + bolum);
    }
    
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome, please select action");
        System.out.println("1 for sum");
        System.out.println("2 for subtraction");
        System.out.println("3 for multiplication");
        System.out.println("4 for division");
        System.out.println("press q to exit");
        
        while(true){
            
        System.out.println("enter transaction");
        
        String islem = scanner.nextLine();
            
        if ("1".equals(islem)) {
            System.out.println("Enter the 1st number");
            int a = scanner.nextInt();
            System.out.println("Enter the 2st number");
            int b = scanner.nextInt();
            
            toplama(a,b);
            break;
        }
        else if ("2".equals(islem)) {
            System.out.println("Enter the 1st number");
            int a = scanner.nextInt();
            System.out.println("Enter the 2st number");
            int b = scanner.nextInt();
            
            cikarma(a,b);
            break;
        }
        else if ("3".equals(islem)) {
            System.out.println("Enter the 1st number");
            int a = scanner.nextInt();
            System.out.println("Enter the 2st number");
            int b = scanner.nextInt();
            
            carpma(a,b);
            break;
        }
        else if ("4".equals(islem)) {
            System.out.println("Enter the 1st number");
            int a = scanner.nextInt();
            System.out.println("Enter the 2st number");
            int b = scanner.nextInt();
            
            bolme(a,b);
            break;
        }
        else if ("q".equals(islem)) {
            break;
        }
        else{
            System.out.println("invalid transaction");
        }
        
        }
                
                
        
        
        
        
    }
                
            
        
    }
