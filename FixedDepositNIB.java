import java.util.Scanner;

/**
 * Write a description of class FixedDepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixedDepositNIB
{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    double feeRate=0.005;
    char choice='y';
    while(choice=='y'){
    System.out.println("enter the amount to deposit (min Rs.1000)");
    double P=sc.nextDouble();
    if(P<1000){
        System.out.println("Deposit must be atleast Rs.1000");
        continue;
    }
    System.out.println("Enter annual interest rate between (8-12%):");
    double R=sc.nextDouble();
    if(R<8 || R>12){
    System.out.println("Rate must be between (8-12%)");
    continue;
    }
    System.out.println("Enter year (max 5)");
    int year=sc.nextInt();
    if(year<1 || year>5){
    System.out.println("Must be between (1-5)");
    continue;
    }
    double rate=R/(12*100);
    int months=year*12;
    double A =P*Math.pow((1+rate),months);
    double fee=A*feeRate;
    double Amount=A-fee;
    
    System.out.println("Fixed deposit amount:");
    System.out.println("Principle:" + P);
    System.out.println("Mturity:" +A);
    System.out.println("Fee:" + fee);
    System.out.println("Total amount:" +Amount);
    
    System.out.println("do you still want to continue?(y/n)");
    sc.nextLine();
    choice=sc.nextLine().charAt(0);
    }
    System.out.println("Thank you for using our calculator");
    sc.close();
    
    }
}