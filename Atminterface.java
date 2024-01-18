import java.util.Scanner;
public class Atminterface
{
    public static void main(String args[])
    {
        int Balance = 100000, Withdraw, Deposit;
        Scanner ab = new Scanner(System.in);
        int pin=9897;
        System.out.println("Enter Pin:- ");
        int pass=ab.nextInt();
        int b=1;
        if(pass!=pin)
        {
            while(true)
            {
                b++;
                System.out.println("Invalid Pin");
                System.out.println("Re-enter pin (Attempts Remaining :- "+b+") : ");
                pass=ab.nextInt();
                if(pass==pin)
                {
                    break;
                }
                if(b==3){
                    System.out.println("You have exceeded your trials,Retry After some time !");
                    System.exit(0);
                }
            }
        }
        if(pass==pin)
        {
            System.out.println("********Welcome********");
            System.out.println("Select an option: ");
            while(true)
            {
                System.out.println("1) Balance Check");
                System.out.println("2) Withdraw money");
                System.out.println("3) Deposit money");
                System.out.println("4) Exit");
                int choice = ab.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Your Balance is :- "+Balance);
                        System.out.println(" ");
                        break;
                    case 2:
                        System.out.println("Enter Withdrawal amount : ");
                        Withdraw=ab.nextInt();
                        if(Withdraw>Balance||Balance==0)
                        {
                            System.out.printf("Sorry you have insufficient balance!!\n");
                            break;
                        }
                        System.out.println("Collect your amount");
                        Balance=Balance-Withdraw;
                        System.out.println(" ");
                        break;
                    case 3:
                        System.out.print("Enter amount to be deposited: ");
                        Deposit = ab.nextInt();
                        Balance = Balance + Deposit;
                        System.out.println("Your Money has been deposited successfully");
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("We are Happy to Service you... Thank you");
                        System.exit(0);
                }
            }
        }
    }
}
