import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String args[]){
    Scanner input= new Scanner (System.in);
    
    char choice='y';
    while(choice == 'y'){
    System.out.println("enter first number");
    int a=input.nextInt();
    System.out.println("enter second number");
    System.out.println("choose an operator (+,-,/,%)");
    char ans=input.next().charAt(0);
    
    int b=input.nextInt();
    switch(choice){
        case '+':
            System.out.println("the sum is : " +(a+b));
            break;
        case '-':
            System.out.println("the sub is : " +(a-b));
            break;
        case '/':
            System.out.println("the div is : " +(a/b));
            break;
        case '%':
            System.out.println("the re is : " +(a%b));
            break;
        default:
            System.out.println("invalid");
        
    }
    System.out.println("do you want to continue?");
    choice=input.next().charAt(0);
    }
    System.out.println("thank you");
    
    
    
    
    }
}