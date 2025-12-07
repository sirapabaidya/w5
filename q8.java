import java.util.Scanner;

/**
 * Write a description of class q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q8
{
    public static void main(String args[]){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=input.nextInt();
    for (int i=1;i<=10;i++){
    System.out.println(n+"x"+i+"="+(n*i));
    }
    
    }
}