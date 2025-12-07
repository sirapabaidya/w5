import java.util.Scanner;

/**
 * Write a description of class wt5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class wt5
{
    public static void main(String args[]){
    for(int i =1; i<=5; i=i+2)
    {
        System.out.println(i);
    }
    //factorial
    int factorial=1;
    Scanner input= new Scanner(System.in);
    System.out.println("give number");
    int num= input.nextInt();
    for(int a =1; a<=num; a=a++)
    {
        factorial=factorial*a;
    }
    System.out.println(factorial);
    
    //while statement
    int w=1;
    while(w<=5)
    {
        System.out.println(w); //no increment so infinite times
    }
    
    int b=1;
    while(b<=5)
    {
        System.out.println(b); //no increment so infinite times
        b++;
    }
    
    //do while
    int d=1;
    do
    {
        System.out.println(d); //1
        d++;
        System.out.println(d); //2
    } while (d>1); //2
    
    //break statement
    for(int br=1;br<5;br++)
    {
        if(br==4)
        {
            System.out.println("met");
            break;
        }
        System.out.println(br);
    
    
    }
    //continue
    for(int con=1;con<5;con++)
    {
        if(con==4)
        {
            System.out.println("met");
            break;
        }
        System.out.println(con);
    
    
    }
    
    for(int e=1;e<5;e++)
    {
        if(e%2==0)
        {
            continue;
        }
        System.out.println(e);
    
    
    }
    
    //nested for
    for(int n=1;n<3;n++) //row
    {
        for(int l=1;l<=2;l++) //column
        {
            System.out.print("n: "+ n + " l: "+ l);
            
            
        }
        System.out.println();
    
    
    }
    
    for(int n=1;n<3;n++)
    {
        for(int l=1;l<=2;l++)
        {
            System.out.print("*");
            
            
        }
        System.out.println();
    
    
    }
    }
}