import java.util.Scanner;

/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{
    public static void main(String args[]){
    Scanner input= new Scanner (System.in);
    System.out.println("ak for a num");
    int n=input.nextInt();
    int temp=n;
    int rem=1;
    int rev=0;
    while(n>0)
    {
        rem=n%10;
        rev=(rev*10)+rem;
        n=(int)(n/10);
    }
    System.out.println("the rev of "+temp+" is: "+rev);
    }
}